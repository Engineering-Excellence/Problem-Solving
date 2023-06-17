# 공 넣기
import sys

inp = sys.stdin.readline
N, M = map(int, inp().split())
baskets = [0] * N
for _ in range(M):
    i, j, k = map(int, inp().split())
    for n in range(i, j + 1):
        baskets[n - 1] = k
print(*baskets)
