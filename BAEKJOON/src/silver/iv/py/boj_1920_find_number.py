# 수 찾기
import sys

inp = sys.stdin.readline

N = int(inp().rstrip())
A = set(map(int, inp().split()))
M = int(inp().rstrip())
nums = list(map(int, inp().split()))
for num in nums:
    print(1 if num in A else 0)
