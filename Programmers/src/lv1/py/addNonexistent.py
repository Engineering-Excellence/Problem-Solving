def solution(numbers: list) -> int:
    """
    없는 숫자 더하기

    :param numbers: 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열
    :type numbers: list
    :return: numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 반환
    :rtype: int
    """
    return 45 - sum(numbers)


print(solution(numbers=[1, 2, 3, 4, 6, 7, 8, 0]))
print(solution(numbers=[5, 8, 4, 0, 6, 7, 9]))
