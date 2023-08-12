# 진법 변환 2

def convert_base(b: int) -> str:
    return chr(b + 55) if b >= 10 else str(b)


def convert_scale(n: int, b: int) -> str:
    ans = ''
    while n > 0:
        n, r = divmod(n, b)
        ans = convert_base(r) + ans
    return ans


if __name__ == '__main__':
    N, B = map(int, input().rstrip().split())
    print(convert_scale(N, B))
