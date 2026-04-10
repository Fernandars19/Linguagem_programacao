def aplicar_desconto(valor, desconto):
    return valor - (valor * desconto / 100)

valor = float(input("Digite o valor do produto: "))
desconto = float(input("Digite o percentual de desconto: "))

resultado = aplicar_desconto(valor, desconto)

print("Valor final:", resultado)