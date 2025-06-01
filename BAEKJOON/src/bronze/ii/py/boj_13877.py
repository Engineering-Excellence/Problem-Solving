# 이건 무슨 진법이지?

from sys import stdin

for _ in range(int(stdin.readline())):
    k, d = stdin.readline().rstrip().split()
    o = int(d, 8) if max(list(d)) < '8' else 0
    print(int(k), o, int(d), int(d, 16))
