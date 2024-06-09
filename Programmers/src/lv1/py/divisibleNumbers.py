def solution(arr: list, divisor: int) -> list:
    """
    나누어 떨어지는 숫자 배열

    :param arr: 자연수를 담은 배열
    :type arr: list
    :param divisor: 자연수
    :type divisor: int
    :return: arr의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환
    :rtype: list
    """
    answer = [i for i in arr if i % divisor == 0]
    return sorted(answer) if answer else [-1]


print(solution(arr=[5, 9, 7, 10], divisor=5))
print(solution(arr=[2, 36, 1, 3], divisor=1))
print(solution(arr=[3, 2, 6], divisor=10))
