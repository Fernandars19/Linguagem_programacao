valor = float(input("Digite o valor do produto: "))
desconto = float(input("Digite o percentual de desconto: "))

valor_final = valor - (valor * desconto / 100)

print("Valor final:", valor_final)