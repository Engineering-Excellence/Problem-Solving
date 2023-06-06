# 최대공약수와 최소공배수
import sys


def get_gcd(a, b):
    while b != 0:
        a, b = b, a % b
    return a


# def get_lcm(a, b):
#     return a * b // get_gcd(a, b)


def main():
    a, b = map(int, sys.stdin.readline().split())
    gcd = get_gcd(a, b)
    print(f'{gcd}\n{a * b // gcd}')


if __name__ == "__main__":
    main()
