nome = input("Digite o nome do produto: ")
preco = float(input("Digite o preço do produto: "))
quantidade = int(input("Digite a quantidade em estoque: "))

if quantidade < 0:
    print("Erro: A quantidade não pode ser um valor negativo. Tente novamente.")
else:
    print("\nProduto cadastrado com sucesso!")
    print("Resumo do produto:")
    print("Nome:", nome)
    print("Preço: R$", preco)
    print("Quantidade em estoque:", quantidade)