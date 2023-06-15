# 랩실에서 잘 자요
import sys

N, M = map(int, sys.stdin.readline().split())
paper = sorted(set(i + 1 for i in range(N)) - set(map(int, sys.stdin.readline().split())))
ink = 0 if len(paper) == 0 else 7
for i in range(len(paper) - 1):
    diff = paper[i + 1] - paper[i]
    ink += min(2 * diff, 7)
print(ink)
