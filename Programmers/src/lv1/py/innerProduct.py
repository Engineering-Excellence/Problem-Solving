def solution(a: list, b: list) -> int:
    """
    내적

    :param a: 길이가 같은 1차원 정수 배열
    :type a: list
    :param b: 길이가 같은 1차원 정수 배열
    :type b: list
    :return: a와 b의 내적
    :rtype: int
    """
    return sum(i * j for i, j in zip(a, b))


print(solution([1, 2, 3, 4], [-3, -1, 0, 2]))
print(solution([-1, 0, 1], [1, 0, -1]))
