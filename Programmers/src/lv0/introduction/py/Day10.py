# 조건문, 배열, 수학, 시뮬레이션

class Day10:
    # 점의 위치 구하기
    def position(self, dot):
        match dot:
            case dot if dot[0] > 0 and dot[1] > 0:
                return 1
            case dot if dot[0] < 0 < dot[1]:
                return 2
            case dot if dot[0] < 0 and dot[1] < 0:
                return 3
            case dot if dot[0] > 0 > dot[1]:
                return 4


if __name__ == '__main__':
    day10 = Day10()
    print(day10.position([-1, 1]))
