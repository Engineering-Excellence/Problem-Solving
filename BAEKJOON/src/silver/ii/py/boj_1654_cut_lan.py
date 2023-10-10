# 랜선 자르기
import sys

inp = sys.stdin.readline
K, N = map(int, inp().rstrip().split())
lines = []
for _ in range(K):
    lines.append(int(inp().rstrip()))
left, right = 1, max(lines)
while left <= right:
    mid = (left + right) // 2
    cnt = sum(line // mid for line in lines)
    if cnt >= N:
        left = mid + 1
    else:
        right = mid - 1
print(right)
