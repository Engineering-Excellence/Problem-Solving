# 마인크래프트
import sys

inp = sys.stdin.readline

N, M, B = map(int, inp().split())
ground = [list(map(int, inp().split())) for _ in range(N)]
min_time = sys.maxsize
min_height = min(min(row) for row in ground)
max_height = max(max(row) for row in ground)

for h in range(min_height, max_height + 1):
    time = 0
    height = h
    block = B
    for n in range(N):
        g = ground[n]
        for m in range(M):
            if g[m] > height:
                time += (g[m] - height) * 2
                block += g[m] - height
            else:
                time += height - g[m]
                block -= height - g[m]
    if block >= 0:
        if time < min_time:
            min_time = time
            max_height = height
        elif time == min_time and height > max_height:
            max_height = height

print(min_time, max_height)
