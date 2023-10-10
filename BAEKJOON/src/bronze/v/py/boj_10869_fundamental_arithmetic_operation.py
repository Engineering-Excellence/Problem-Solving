import sys

# 사칙연산
a, b = map(int, sys.stdin.readline().split())
sys.stdout.write(str(a + b) + '\n')
sys.stdout.write(str(a - b) + '\n')
sys.stdout.write(str(a * b) + '\n')
sys.stdout.write(str(a // b) + '\n')
sys.stdout.write(str(a % b))
sys.stdout.flush()

# a, b = map(int, input().split())
# print(a + b)
# print(a - b)
# print(a * b)
# print(a // b)
# print(a % b)
