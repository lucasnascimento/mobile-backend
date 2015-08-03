package br.com.reges.mobilebackend;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Teste {
	public static void main(String[] args) {
		new A();
	}
}

class O {
	String att;
}

class A extends JFrame {
	private static final long serialVersionUID = 1L;

	public A() {
		setPreferredSize(new Dimension(800, 600));
		setVisible(true);
		Button b = new Button("teste");
		final O o = new O();

		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				o.att = "Lucas";
			}
		});
		add(b);
	}
}