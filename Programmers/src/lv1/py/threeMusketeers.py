from itertools import combinations


def solution(number: list) -> int:
    """
    삼총사

    :param number: 학생들의 번호를 나타내는 정수 배열
    :type number: list
    :return: 학생들 중 삼총사를 만들 수 있는 방법의 수
    :rtype: int
    """
    cnt = 0
    for i in combinations(number, r=3):
        if sum(i) == 0:
            cnt += 1
    return cnt


print(solution(number=[-2, 3, 0, 2, -5]))
print(solution(number=[-3, -2, -1, 0, 1, 2, 3]))
print(solution(number=[-1, 1, -1, 1]))
