# 치킨댄스를 추는 곰곰이를 본 임스

import sys

n = int(sys.stdin.readline())
a, b = map(int, sys.stdin.readline().split())

print(min(n, a // 2 + b))
