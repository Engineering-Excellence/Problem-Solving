# 팰린드롬

from sys import stdin

n = int(stdin.readline())
for _ in range(n):
    s = stdin.readline().lower().strip()
    print("Yes" if s == s[::-1] else "No")
