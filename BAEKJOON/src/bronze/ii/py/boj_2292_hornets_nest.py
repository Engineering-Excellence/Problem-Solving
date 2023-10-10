import sys

# 벌집

N = int(sys.stdin.readline())
cnt = 1
num = 1
while N > num:
    num += 6 * cnt
    cnt += 1
print(cnt)
