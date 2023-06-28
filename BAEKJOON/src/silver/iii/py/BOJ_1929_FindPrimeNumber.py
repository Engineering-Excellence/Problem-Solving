# 소수 구하기
import sys

M, N = map(int, sys.stdin.readline().split())

is_prime = [True] * (N + 1)
is_prime[0] = False
is_prime[1] = False

for i in range(2, int(N ** 0.5) + 1):  # 제곱근 범위까지만 검사하여 소수를 판별
    if is_prime[i]:  # i가 소수인 경우
        for j in range(i ** 2, N + 1, i):  # i**2부터 시작하여 i씩 증가하는 수들은 모두 i의 배수
            is_prime[j] = False  # i의 배수들을 소수가 아니라고 표시

print(*(prime for prime in filter(lambda x: is_prime[x], range(M, N + 1))), sep='\n')
