# 영수증
import sys

X = int(sys.stdin.readline())
N = int(sys.stdin.readline())
tot = 0
for _ in range(N):
    a, b = map(int, sys.stdin.readline().split())
    tot += a * b
print('Yes' if X == tot else 'No')
