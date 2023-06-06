# 문자열 집합
import sys


def main():
    N, M = map(int, sys.stdin.readline().split())
    cnt = 0
    s = set(sys.stdin.readline().rstrip() for _ in range(N))
    for _ in range(M):
        if sys.stdin.readline().rstrip() in s:
            cnt += 1
    print(cnt)


if __name__ == "__main__":
    main()
