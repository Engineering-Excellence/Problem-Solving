# Hashing
import sys


def hashing(L, a):
    r = 31
    M = 1234567891
    H = 0

    for i in range(L):
        H = (H + (a[i] - 96) * r ** i) % M  # 나머지 연산의 분배법칙: (a + b) % c = (a % c + b % c) % c

    return H


def main():
    L = int(sys.stdin.readline())
    a = list(map(ord, sys.stdin.readline().rstrip()))

    result = hashing(L, a)
    print(result)


if __name__ == "__main__":
    main()
