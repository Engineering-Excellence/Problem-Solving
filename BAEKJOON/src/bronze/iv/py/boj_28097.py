# 모범생 포닉스

N = int(input())
T = sum(map(int, input().split())) + (N - 1) * 8
print(*divmod(T, 24))
