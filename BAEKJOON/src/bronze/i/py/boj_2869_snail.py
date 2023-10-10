# 달팽이는 올라가고 싶다
import math
import sys

A, B, V = map(int, sys.stdin.readline().split())
print(math.ceil((V - A) / (A - B)) + 1)
