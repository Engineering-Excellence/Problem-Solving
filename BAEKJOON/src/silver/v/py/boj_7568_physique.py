# 덩치
import sys


def count_larger(bulks, weight, height):
    cnt = 1
    for w, h in bulks:
        if weight < w and height < h:
            cnt += 1
    return cnt


if __name__ == '__main__':
    N = int(sys.stdin.readline())
    bulks = [tuple(map(int, sys.stdin.readline().split())) for _ in range(N)]
    print(*[count_larger(bulks, weight, height) for weight, height in bulks])
