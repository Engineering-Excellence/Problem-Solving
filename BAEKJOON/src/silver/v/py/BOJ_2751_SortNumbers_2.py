# 수 정렬하기 2
import sys

N = int(sys.stdin.readline())
nums = sorted(int(sys.stdin.readline()) for _ in range(N))
for num in nums:
    print(num)
