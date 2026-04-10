soma = 0

for i in range(1, 6):
    nota = float(input(f"Digite a nota {i}: "))
    soma += nota

media = soma / 5

print("Média final:", media)