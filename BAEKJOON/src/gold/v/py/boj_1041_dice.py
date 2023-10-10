# 주사위
import sys

n = int(sys.stdin.readline().rstrip())
dice = list(map(int, sys.stdin.readline().rstrip().split()))

if n == 1:
    dice.sort()
    print(sum(dice[i] for i in range(5)))
else:
    side = list(min(dice[i], dice[5 - i]) for i in range(3))
    side.sort()
    print((5 * n ** 2 - 8 * n + 4) * side[0] + (8 * n - 8) * side[1] + 4 * side[2])
