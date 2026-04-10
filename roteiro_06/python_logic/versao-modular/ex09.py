def contar_vogais(texto):

    contador = 0

    for letra in texto.lower():
        if letra in "aeiou":
            contador += 1

    return contador

texto = input("Digite uma palavra ou frase: ")

resultado = contar_vogais(texto)

print("Quantidade de vogais:", resultado)