# 좌표 정렬하기
# import sys
# from operator import itemgetter
#
# N = int(sys.stdin.readline())
# cartesian = list()
# for _ in range(N):
#     x, y = map(int, sys.stdin.readline().rstrip().split())
#     cartesian.append((x, y))
# cartesian.sort(key=itemgetter(0, 1))
# for x, y in cartesian:
#     print(x, y)

import sys

n = int(sys.stdin.readline())
cartesian = [sys.stdin.readline().rstrip() for _ in range(n)]
cartesian.sort(key=lambda c: int(c.split()[1]))
cartesian.sort(key=lambda c: int(c.split()[0]))
print("".join(cartesian))
