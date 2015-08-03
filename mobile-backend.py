from flask import Flask
from flask import jsonify
import json

app = Flask(__name__)


class Aluno:
    def __init__(self):
        pass


@app.route('/alunos/<int:ultimo_id>')
def return_mocked_new_alunos(ultimo_id):

    alunos = list()
    a = Aluno()

    for i in range(0,3):
        a.id = ultimo_id + i + 1
        a.nome = "Aluno ", a.id
        a.endereco = "Endereco ", a.id
        a.telefone = "Telefone ", a.id
        a.nota = 5.0
        alunos.append(a)

    return json.dumps(alunos)

@app.route('/user/<username>')
def show_user_profile(username):
    # show the user profile for that user
    return 'User %s' % username


if __name__ == '__main__':
    app.debug = True
    app.run()
