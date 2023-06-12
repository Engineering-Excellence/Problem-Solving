# 사분면 고르기
import sys

x = int(sys.stdin.readline())
y = int(sys.stdin.readline())

match x, y:
    case x, y if x > 0 and y > 0:
        sys.stdout.write("1")

    case x, y if x < 0 < y:
        sys.stdout.write("2")

    case x, y if x < 0 and y < 0:
        sys.stdout.write("3")

    case x, y if x > 0 > y:
        sys.stdout.write("4")

    case _:
        pass
