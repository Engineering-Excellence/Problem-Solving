# 이항 계수 1
import math
import sys

n, k = map(int, sys.stdin.readline().split())

# result = 1
# for i in range(min(k, n - k)):
#     result *= n - i
#     result //= i + 1

result = math.factorial(n) // (math.factorial(k) * math.factorial(n - k))

print(result)
