import sys

# 직사각형에서 탈출

x, y, w, h = map(int, sys.stdin.readline().split())
print(min(x, y, w - x, h - y))
