# 웰컴 키트

from math import ceil

n = int(input())
sizes = map(int, input().split())
t, p = map(int, input().split())

q, r = divmod(n, p)
print(sum([ceil(size / t) for size in sizes]))
print(q, r)
