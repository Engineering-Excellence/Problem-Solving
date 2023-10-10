# 별 찍기 - 7
import sys

N = int(sys.stdin.readline().rstrip())
[sys.stdout.write(f"{' ' * abs(i)}{'*' * (2 * (N - abs(i)) - 1)}\n") for i in range(-N + 1, N)]
