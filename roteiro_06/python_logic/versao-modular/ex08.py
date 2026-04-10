def classificar_triangulo(a, b, c):

    if a == b == c:
        return "Equilátero"
    elif a == b or a == c or b == c:
        return "Isósceles"
    else:
        return "Escaleno"

a = float(input("Lado 1: "))
b = float(input("Lado 2: "))
c = float(input("Lado 3: "))

tipo = classificar_triangulo(a, b, c)

print("Tipo:", tipo)