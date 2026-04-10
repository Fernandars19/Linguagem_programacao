produtos = []
quantidades = []
precos = []

opcao = 0

while opcao != 3:

    print("\n1 - Adicionar produto")
    print("2 - Listar produtos")
    print("3 - Sair")

    opcao = int(input("Escolha uma opção: "))

    if opcao == 1:
        nome = input("Nome do produto: ")
        qtd = int(input("Quantidade: "))

        if qtd < 0:
            print("Erro: quantidade não pode ser negativa.")
            continue

        preco = float(input("Preço: "))

        produtos.append(nome)
        quantidades.append(qtd)
        precos.append(preco)

    elif opcao == 2:

        for i in range(len(produtos)):
            print("\nProduto:", produtos[i])
            print("Quantidade:", quantidades[i])
            print("Preço:", precos[i])

print("Sistema encerrado.")