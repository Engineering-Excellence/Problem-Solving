import sys

# X보다 작은 수

N, X = map(int, sys.stdin.readline().split())
A = list(map(int, sys.stdin.readline().split()))
for i in A:
    if i < X:
        print(i, end=' ')
