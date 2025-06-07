# 반복

ans = 1
s = input()
for i in range(len(s) - 1):
    if ord(s[i]) >= ord(s[i + 1]):
        ans += 1
print(ans)
