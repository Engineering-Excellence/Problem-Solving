# 사분면 고르기
import sys

x = int(sys.stdin.readline())
y = int(sys.stdin.readline())

match x, y:
    case x, y if x > 0 and y > 0:
        print(1)

    case x, y if x < 0 < y:
        print(2)

    case x, y if x < 0 and y < 0:
        print(3)

    case x, y if x > 0 > y:
        print(4)

    case _:
        pass
