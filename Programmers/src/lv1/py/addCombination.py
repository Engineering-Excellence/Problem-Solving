from itertools import combinations


def solution(numbers: list) -> list:
    """
    두 개 뽑아서 더하기

    :param numbers: 정수 배열
    :type numbers: list
    :return: numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 반환
    :rtype: list
    """
    answer = set()
    for i, j in combinations(numbers, r=2):
        answer.add(i + j)
    return sorted(answer)


print(solution(numbers=[2, 1, 3, 4, 1]))
print(solution(numbers=[5, 0, 2, 7]))
