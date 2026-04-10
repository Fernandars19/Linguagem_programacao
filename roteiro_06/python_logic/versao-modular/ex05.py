def celsius_para_fahrenheit(c):
    return (c * 9/5) + 32

celsius = float(input("Digite a temperatura em Celsius: "))

f = celsius_para_fahrenheit(celsius)

print("Temperatura em Fahrenheit:", f)