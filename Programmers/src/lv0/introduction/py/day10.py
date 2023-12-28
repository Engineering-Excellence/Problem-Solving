class Day10:
    """
    <h1>Day10 조건문, 배열, 수학, 시뮬레이션</h1>
    Programmers 코딩테스트 입문

    :author: Kyle
    :since: 2023.10.05.
    """

    @staticmethod
    def position(dot: list) -> int:
        """
        position 점의 위치 구하기

        :param dot: 좌표 (x, y)를 차례대로 담은 정수 배열
        :return: 사분면
        """
        match dot:
            case dot if dot[0] > 0 and dot[1] > 0:
                return 1
            case dot if dot[0] < 0 < dot[1]:
                return 2
            case dot if dot[0] < 0 and dot[1] < 0:
                return 3
            case dot if dot[0] > 0 > dot[1]:
                return 4

    @staticmethod
    def make_2d(num_list: list, n: int) -> list:
        """
        make_2d 2차원으로 만들기

        :param num_list: 정수 배열
        :param n: 정수
        :return: 2차원 배열로 변환된 num_list
        """
        return [num_list[i:i + n] for i in range(0, len(num_list), n)]

    @staticmethod
    def throw_ball(numbers: list, k: int) -> int:
        """
        throw_ball 공 던지기

        :param numbers: 친구들의 번호가 들어있는 정수 배열
        :param k: 정수
        :return: k번째로 공을 던지는 사람의 번호
        """
        return numbers[2 * (k - 1) % len(numbers)]


if __name__ == '__main__':
    day10 = Day10()
    print(day10.position([-1, 1]))
    print(day10.make_2d([100, 95, 2, 4, 5, 6, 18, 33, 948], 3))
