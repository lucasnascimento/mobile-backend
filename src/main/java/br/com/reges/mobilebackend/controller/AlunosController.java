package br.com.reges.mobilebackend.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.reges.mobilebackend.model.Aluno;

@RestController
public class AlunosController {
	
	@RequestMapping("/alunos/{ultimo_id}")
    public Map<String, List<Aluno>> listNovosAlunos(@PathVariable(value="ultimo_id")Integer ultimoId) throws InterruptedException {
		List<Aluno> alunos = new ArrayList<Aluno>();
		for(int i = 0 ; i<= 3 ; i++){
			Aluno aluno = new Aluno();
			aluno.setId(ultimoId + i + 1);
			aluno.setNome("Nome aluno " + aluno.getId());
			aluno.setEndereco("Endereco aluno" + + aluno.getId());
			aluno.setTelefone("Telefone aluno" + + aluno.getId());
			aluno.setNota(6.0f);
			alunos.add(aluno);
		}

		Thread.sleep(3000);
		
		Map<String, List<Aluno>> mapAlunos = new HashMap<String, List<Aluno>>();
		mapAlunos.put("alunos", alunos);
        return mapAlunos;
    }

}
