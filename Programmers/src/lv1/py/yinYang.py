def solution(absolutes: list, signs: list) -> int:
    """
    음양 더하기

    :param absolutes: 정수들의 절댓값을 차례대로 담은 정수 배열
    :type absolutes: list
    :param signs: 정수들의 부호를 차례대로 담은 불리언 배열
    :type signs: list
    :return: 실제 정수들의 합
    :rtype: int
    """
    return sum(a if s else -a for a, s in zip(absolutes, signs))


print(solution([4, 7, 12], [True, False, True]))
print(solution([1, 2, 3], [False, False, True]))
