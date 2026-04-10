def exibir_cabecalho():
    print("=================================")
    print("     SORVETERIA DO DENER 🍦")
    print("   Sistema de Controle de Estoque")
    print("=================================")


def verificar_estoque_critico(quantidade):
    if quantidade < 5:
        return "[REPOSIÇÃO NECESSÁRIA]"
    else:
        return ""


exibir_cabecalho()

nomes = []
quantidades = []

i = 0

while i < 3:
    nome = input("Digite o nome do insumo: ")
    qtd = int(input("Digite a quantidade: "))

    nomes.append(nome)
    quantidades.append(qtd)

    i += 1

print("\nRelatório de Estoque:")

i = 0
while i < len(nomes):

    aviso = verificar_estoque_critico(quantidades[i])

    print(f"Produto: {nomes[i]} | Estoque: {quantidades[i]} unidades {aviso}")

    i += 1