# 약수 구하기

def find_kth_divisor(n, k):
    cnt = 0
    for i in range(1, n // 2 + 1):
        if n % i == 0:
            cnt += 1
            if cnt == k:
                return i
    if cnt + 1 == k:
        return n
    return 0


if __name__ == '__main__':
    N, K = map(int, input().split())
    print(find_kth_divisor(N, K))
