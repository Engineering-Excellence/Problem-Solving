# 다이얼
import sys


def time(char: str) -> int:
    match char:
        case char if ord(char) < 81:
            sec = (ord(char) - 56) // 3
        case char if 81 <= ord(char) < 90:
            sec = (ord(char) - 57) // 3
        case _:
            sec = 10
    return sec


if __name__ == '__main__':
    dials = list(sys.stdin.readline().rstrip())
    print(sum(time(dial) for dial in dials))
