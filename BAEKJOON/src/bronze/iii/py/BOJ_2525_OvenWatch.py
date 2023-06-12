# 오븐 시계
import sys

A, B = map(int, sys.stdin.readline().split())
C = int(sys.stdin.readline())
sys.stdout.write(f'{(A + (B + C) // 60) % 24} {(B + C) % 60}')
