# 곱셈
import sys

num1 = int(sys.stdin.readline().rstrip())
num2 = sys.stdin.readline().rstrip()
for i in range(len(num2) - 1, -1, -1):
    print(num1 * int(num2[i]))
print(num1 * int(num2))
