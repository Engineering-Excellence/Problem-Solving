# 부녀회장이 될테야
import sys


class Resident:
    def __init__(self, _, n):
        self.residents = dict()
        for i in range(1, n + 1):
            self.residents[(0, i)] = i
            self.residents[(1, i)] = i * (i + 1) // 2

    def get_resident(self, k, n):
        if self.residents.get((k, n)) is None:
            self.residents[(k, n)] = sum(self.get_resident(k - 1, i) for i in range(1, n + 1))
        return self.residents[(k, n)]


def main():
    for _ in range(int(sys.stdin.readline())):
        k = int(sys.stdin.readline())
        n = int(sys.stdin.readline())
        print(Resident(k, n).get_resident(k, n))


if __name__ == '__main__':
    main()
