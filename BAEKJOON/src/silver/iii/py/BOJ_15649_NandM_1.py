# N과 M (1)
import sys

N, M = map(int, sys.stdin.readline().split())
visited = [False] * N
rs = []


def backtrack(depth):
    if depth == M:
        print(*rs)
        return
    for i in range(N):
        if not visited[i]:
            visited[i] = True
            rs.append(i + 1)
            backtrack(depth + 1)
            visited[i] = False
            rs.pop()


def main():
    backtrack(0)


if __name__ == "__main__":
    main()
