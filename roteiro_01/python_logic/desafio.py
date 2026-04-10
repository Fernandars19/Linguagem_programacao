ganho = float(input("Digite o ganho obtido: "))
investimento = float(input("Digite o valor investido: "))

if investimento == 0:
    print("Erro: O investimento não pode ser zero.")
else:
    roi = (ganho - investimento) / investimento
    print("ROI: ", roi)