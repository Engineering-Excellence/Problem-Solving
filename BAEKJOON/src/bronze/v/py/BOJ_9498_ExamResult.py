import sys

# 시험 성적

pt = int(sys.stdin.readline()) // 10

match pt:
    case 9 | 10:
        print('A')
    case 8:
        print('B')
    case 7:
        print('C')
    case 6:
        print('D')
    case _:
        print('F')
