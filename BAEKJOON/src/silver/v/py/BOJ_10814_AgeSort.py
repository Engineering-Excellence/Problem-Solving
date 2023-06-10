# 나이순 정렬
import sys
from operator import itemgetter

N = int(sys.stdin.readline())
arr = list()
for _ in range(N):
    age, name = sys.stdin.readline().strip().split()
    arr.append((int(age), name))
arr.sort(key=itemgetter(0))
for item in arr:
    print(*item)
