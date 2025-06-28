# 큰 수 계산

from sys import stdin

formula = []
n = int(stdin.readline())

for _ in range(2 * n - 1):
    formula.append(stdin.readline().rstrip())

print(eval(''.join(formula).replace("/", "//")))
