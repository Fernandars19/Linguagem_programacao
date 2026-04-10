A = []
B = []
C = []

print("Digite 20 números para A")

for i in range(20):
    A.append(float(input(f"A[{i}]: ")))

print("Digite 20 números para B")

for i in range(20):
    B.append(float(input(f"B[{i}]: ")))

for i in range(20):
    C.append(A[i] - B[i])

print("Resultado da matriz C:")

for i in range(20):
    print(C[i])