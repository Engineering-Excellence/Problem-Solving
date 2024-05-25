def solution(arr: list) -> list:
    """
    제일 작은 수 제거하기

    :param arr: 정수를 저장한 배열
    :type arr: list
    :return: 가장 작은 수를 제거한 배열을 반환
    :rtype: list
    """
    arr.remove(min(arr))
    return arr or [-1]


print(solution([4, 3, 2, 1]))
print(solution([10]))
