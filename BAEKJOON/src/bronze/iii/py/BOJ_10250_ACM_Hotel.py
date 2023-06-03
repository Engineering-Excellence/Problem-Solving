import sys

# ACM 호텔

for _ in range(int(sys.stdin.readline())):
    H, W, N = map(int, sys.stdin.readline().split())
    sys.stdout.write(f'{(N - 1) % H + 1}{(N - 1) // H + 1:02d}\n')
