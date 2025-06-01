# 골드 러시

from sys import stdin

for _ in range(int(stdin.readline())):
    n, a, b = map(int, stdin.readline().split())
    tmp = min(a, b)
    print(n - (tmp & -tmp).bit_length() + 1)    # x & -x: 최하위 유효 비트 추출
