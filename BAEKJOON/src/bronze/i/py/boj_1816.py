# 암호 키

from math import sqrt

LIM = 10 ** 6
is_prime = [True] * (LIM + 1)
is_prime[0] = is_prime[1] = False
primes = []

# 에라토스테네스의 체(100만 이하)
for p in range(2, int(sqrt(LIM)) + 1):
    if is_prime[p]:
        primes.append(p)
        if p ** 2 > LIM:
            continue
        for i in range(p ** 2, LIM + 1, p):  # 소수 p의 배수는 합성수
            is_prime[i] = False

for p in range(int(sqrt(LIM)) + 1, LIM + 1):
    if is_prime[p]:
        primes.append(p)

for _ in range(int(input())):
    s = int(input())
    for p in primes:
        if s % p == 0:
            print("NO")
            break
    else:
        print("YES")
