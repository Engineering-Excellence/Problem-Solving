# 집합의 표현
import sys


def find_parent(x: int) -> int:
    if x != parent[x]:
        parent[x] = find_parent(parent[x])
    return parent[x]


def union_parent(left: int, right: int):
    parent[find_parent(left)] = find_parent(right)


if __name__ == '__main__':
    sys.setrecursionlimit(10 ** 6)
    inp = sys.stdin.readline
    n, m = map(int, inp().split())
    parent = list(i for i in range(n + 1))
    for _ in range(m):
        op, a, b = map(int, inp().split())
        if op == 0:
            union_parent(a, b)
        else:
            print('YES' if find_parent(a) == find_parent(b) else 'NO')
