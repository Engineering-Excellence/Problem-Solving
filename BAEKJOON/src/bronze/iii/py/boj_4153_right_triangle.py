import sys

# 직각삼각형
while True:
    a, b, c = sorted(map(int, sys.stdin.readline().split()))
    if a == b == c == 0:
        break
    else:
        sys.stdout.write(('right' if a ** 2 + b ** 2 == c ** 2 else 'wrong') + '\n')
