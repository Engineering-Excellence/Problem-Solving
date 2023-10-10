# 공 바꾸기
import sys

inp = sys.stdin.readline
N, M = map(int, inp().split())
baskets = [i for i in range(N + 1)]
for _ in range(M):
    i, j = map(int, inp().split())
    baskets[i], baskets[j] = baskets[j], baskets[i]
print(*baskets[1:])
