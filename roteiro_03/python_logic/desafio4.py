numsecret = 7
tentativa = 0

while tentativa != numsecret:
    tentativa = int(input("Adivinhe o número: "))

    if tentativa > numsecret:
        print("Tente um número menor!")
    elif tentativa < numsecret:
        print("Tente um número maior!")

print("Parabéns! Você acertou!")