# 블랙잭
import sys


def blackjack(n, m, arr):
    res = 0
    for i in range(n - 2):
        for j in range(i + 1, n - 1):
            for k in range(j + 1, n):
                tot = arr[i] + arr[j] + arr[k]
                if tot <= m:
                    res = max(res, tot)
                else:
                    break
    return res


N, M = map(int, sys.stdin.readline().split())
cards = list(map(int, sys.stdin.readline().split()))
cards.sort()
print(blackjack(N, M, cards))
