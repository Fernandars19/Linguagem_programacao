nota = int(input("Digite a nota (0-100): "))

if nota >= 90:
    print("Categoria A")
elif nota >= 80:
    print("Categoria B")
elif nota >= 70:
    print("Categoria C")
elif nota >= 60:
    print("Categoria D")
else:
    print("Categoria E")