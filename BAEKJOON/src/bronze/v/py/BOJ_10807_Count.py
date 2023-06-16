# 개수 세기
import sys

inp = sys.stdin.readline
N = int(inp())
nums = list(map(int, inp().split()))
print(nums.count(int(inp())))
