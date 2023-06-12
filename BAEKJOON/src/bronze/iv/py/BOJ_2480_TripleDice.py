# 주사위 세개
import sys

dice = list(map(int, sys.stdin.readline().split()))
match len(set(dice)):
    case 1:
        print(10000 + dice[0] * 1000)
    case 2:
        print(1000 + (dice[0] if dice[0] == dice[1] else dice[2]) * 100)
    case 3:
        print(max(dice) * 100)
