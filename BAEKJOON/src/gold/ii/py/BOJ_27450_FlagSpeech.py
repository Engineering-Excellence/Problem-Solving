# 플래그 대사 그만 좀 말해요
import sys
from collections import deque

n, k = map(int, sys.stdin.readline().split())
p = [0] + list(map(int, sys.stdin.readline().split()))
t = [0] + list(map(int, sys.stdin.readline().split()))
additional_power = [0] * (n + 1)
speech = deque([0] * k)
effective_shout = 0
shout = 0

for i in range(1, n + 1):
    additional_power[i] = additional_power[i - 1] - effective_shout  # 현재 위치 추가 파워 = 이전 위치 누적 추가 파워 - 누적 유효 대사 횟수
    p[i] += additional_power[i]
    count = max(0, (t[i] - p[i] + k - 1) // k)  # 필요한 대사 횟수
    shout += count  # 대사 횟수 누적
    effective_shout += count  # 현재까지 외친 유효 대사 횟수
    speech.append(count)  # 대사 횟수를 speech에 추가
    additional_power[i] += count * k  # 추가 파워
    p[i] += count * k  # 현재 파워 갱신
    effective_shout -= speech.popleft()  # 가장 오래된 대사 제거

print(shout)
