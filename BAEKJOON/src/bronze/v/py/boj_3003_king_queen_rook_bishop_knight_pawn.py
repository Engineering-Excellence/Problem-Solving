# 킹, 퀸, 룩, 비숍, 나이트, 폰
import sys

pieces = list(map(int, sys.stdin.readline().split()))
chess = [1, 1, 2, 2, 2, 8]
print(*(chess[i] - pieces[i] for i in range(len(chess))))
