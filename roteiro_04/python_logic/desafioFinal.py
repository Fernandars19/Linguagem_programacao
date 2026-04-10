nomes = []
quantidades = []

for i in range(3):
    nome = input("Nome do produto: ")
    qtd = int(input("Quantidade: "))

    nomes.append(nome)
    quantidades.append(qtd)

print("\nRelatório Final:")

for i in range(3):

    if quantidades[i] < 5:
        print(f"Produto: {nomes[i]} | Estoque: {quantidades[i]} unidades [REPOSIÇÃO NECESSÁRIA]")
    else:
        print(f"Produto: {nomes[i]} | Estoque: {quantidades[i]} unidades")