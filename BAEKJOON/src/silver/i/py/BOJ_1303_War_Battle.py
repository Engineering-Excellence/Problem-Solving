# 전쟁 - 전투
import sys

sys.setrecursionlimit(10 ** 6)

dx = [-1, 0, 1, 0]
dy = [0, -1, 0, 1]


def dfs(x, y, target):
    if x < 0 or x >= M or y < 0 or y >= N:
        return False

    elif graph[x][y] == target:
        cnt.append(1)
        graph[x][y] = True
        for d in range(4):
            nx = x + dx[d]
            ny = y + dy[d]
            dfs(nx, ny, target)
        return True

    else:
        return False


if __name__ == '__main__':
    N, M = map(int, input().split())

    graph = [list(input()) for _ in range(M)]

    cnt = []
    res_W = []
    res_B = []

    for m in range(M):
        for n in range(N):
            if dfs(m, n, "W"):
                res_W.append(len(cnt) ** 2)
                cnt = []
            elif dfs(m, n, "B"):
                res_B.append(len(cnt) ** 2)
                cnt = []

    print(sum(res_W), sum(res_B))
