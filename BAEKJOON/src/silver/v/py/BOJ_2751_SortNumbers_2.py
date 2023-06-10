# 수 정렬하기 2
import sys

N = int(sys.stdin.readline())
print(*sorted(int(sys.stdin.readline()) for _ in range(N)), sep='\n')
