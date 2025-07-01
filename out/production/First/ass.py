def calculator():
    print("Простой калькулятор на Python")
    print("Доступные операции: +, -, *, /")
    try:
        num1 = float(input("Введите первое число: "))
        op = input("Введите операцию (+, -, *, /): ")
        num2 = float(input("Введите второе число: "))

        if op == '+':
            result = num1 + num2
        elif op == '-':
            result = num1 - num2
        elif op == '*':
            result = num1 * num2
        elif op == '/':
            if num2 == 0:
                print("Ошибка: деление на ноль!")
                return
            result = num1 / num2
        else:
            print("Ошибка: неизвестная операция.")
            return

        print("Результат:", result)
    except ValueError:
        print("Ошибка: введите корректные числа.")

if __name__ == "__main__":
    calculator()