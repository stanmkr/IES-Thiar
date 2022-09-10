while True:
    userInput = int(input("Introduce un número comprendido entre 1 y 5: "))
    if 1 <= userInput <= 5:
        break

for x in range(10, 20 + 1):
    if x % userInput == 0:
        print(f"{x} es múltiplo de {userInput}")
