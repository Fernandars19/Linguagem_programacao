def gerar_mensagem_boas_vindas(nome, idade):
    return f"Bem-vindo {nome}! Você tem {idade} anos."

nome = input("Digite seu nome: ")
idade = int(input("Digite sua idade: "))

mensagem = gerar_mensagem_boas_vindas(nome, idade)

print(mensagem)