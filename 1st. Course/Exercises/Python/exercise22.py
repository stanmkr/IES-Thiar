num = int(input("Dame un número del 1 al 10 para ver su tabla de multiplicar: "))
while 10 < num or num < 1:
    num = int(input("Dame un número del 1 al 10 para ver su tabla de multiplicar: "))
print(f"\nTabla de multiplicar de {num}")
for x in range(1, 11):
    print(f"{num}*{x} = {num * x}")
