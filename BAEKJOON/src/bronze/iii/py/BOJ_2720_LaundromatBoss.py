# 세탁소 사장 동혁
import sys


def cal_change(r):
    q, r = divmod(r, 25)
    d, r = divmod(r, 10)
    n, p = divmod(r, 5)
    print(f'{q} {d} {n} {p}')


if __name__ == '__main__':
    inp = sys.stdin.readline
    T = int(inp().rstrip())
    for _ in range(T):
        cal_change(int(inp().rstrip()))
