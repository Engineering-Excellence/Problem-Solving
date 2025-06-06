# 분수좋아해?

from sys import stdin

ans = []

while True:
    a, b = map(int, stdin.readline().split())
    if a == 0 and b == 0:
        break
    q, r = divmod(a, b)
    ans.append(f"{q} {r} / {b}")

print('\n'.join(ans))
