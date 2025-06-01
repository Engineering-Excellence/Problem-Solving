# 부호

from sys import stdin

for _ in range(3):
    n = int(stdin.readline())
    s = sum([int(stdin.readline()) for _ in range(n)])

    if s > 0:
        print('+')
    elif s < 0:
        print('-')
    else:
        print('0')
