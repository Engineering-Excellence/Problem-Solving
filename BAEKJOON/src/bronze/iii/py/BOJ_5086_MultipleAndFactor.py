# 배수와 약수

while True:
    a, b = map(int, input().rstrip().split())
    if a == 0 and b == 0:
        break
    match a, b:
        case a, b if b % a == 0:
            print("factor")
        case a, b if a % b == 0:
            print("multiple")
        case _:
            print("neither")
