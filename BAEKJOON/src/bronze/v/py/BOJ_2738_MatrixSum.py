# 행렬 덧셈
import sys

inp = sys.stdin.readline
N, M = map(int, inp().split())
A = [list(map(int, inp().split())) for _ in range(N)]
B = [list(map(int, inp().split())) for _ in range(N)]

result = [[A[i][j] + B[i][j] for j in range(M)] for i in range(N)]
for row in result:
    # print(*row)
    print(' '.join(map(str, row)))
