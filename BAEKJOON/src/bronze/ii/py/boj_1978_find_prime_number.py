import math
import sys


# 소수 찾기
def is_prime(num):
    if num < 2:  # 1은 소수가 아님
        return False
    for i in range(2, int(math.sqrt(num)) + 1):  # i ** 2가 num보다 큰 경우, i의 배수는 이미 이전 단계에서 모두 제거되었으므로 반복 불필요
        if num % i == 0:  # num이 i로 나누어 떨어지면 소수가 아니므로 반복문을 종료
            return False
    return True
    # return num > 1 and all(num % i for i in range(2, int(math.sqrt(num)) + 1))


N = int(sys.stdin.readline())
nums = list(map(int, sys.stdin.readline().split()))
cnt = sum(is_prime(num) for num in nums)
print(cnt)
