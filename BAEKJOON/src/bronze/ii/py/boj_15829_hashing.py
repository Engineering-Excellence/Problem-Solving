# Hashing
import sys


class Hashing:
    def __init__(self):
        self.r = 31
        self.M = 1234567891
        self.H = 0

    def hashing(self, L, a):
        for i in range(L):
            self.H = (self.H + (a[i] - ord('a') + 1) * pow(self.r, i, self.M)) % self.M

        return self.H


def main():
    L = int(sys.stdin.readline())
    a = list(map(ord, sys.stdin.readline().rstrip()))

    print(Hashing().hashing(L, a))


if __name__ == "__main__":
    main()
