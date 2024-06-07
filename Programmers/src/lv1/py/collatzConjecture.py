def solution(num: int) -> int:
    """
    콜라츠 추측

    :param num: 1 이상 8,000,000 미만인 정수
    :type num: int
    :return: num을 1로 만들기 위한 콜라츠 추측 작업 횟수
    :rtype: int
    """
    for cnt in range(500):
        if num == 1:
            return cnt
        num = num / 2 if num % 2 == 0 else num * 3 + 1
    return -1


print(solution(num=6))
print(solution(num=16))
print(solution(num=626331))
