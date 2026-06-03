class Aluno:
    def __init__(self, nome, idade, nota):
        self.nome = nome
        self.idade = idade
        self.nota = nota

    def Estudar(self):
        return f"{self.nome}'comecçou a estudar."

    def FazerProva(self):
        return f"A sua nota foi: {self.nota}..."
    
    def Colar(self):
        return f"{self.nome} 'esta colando"

Aluno1 = Aluno("Guilherme", 21, 4)
Aluno2 = Aluno("Julia", 21, 2)
Aluno3 = Aluno("Davi", 21, 0)

print(Aluno1.Estudar())
print(Aluno2.FazerProva())
print(Aluno3.Colar())