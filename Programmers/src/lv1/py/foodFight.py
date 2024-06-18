def solution(food: list) -> str:
    """
    푸드 파이트 대회

    :param food: 수웅이가 준비한 음식의 양을 칼로리가 적은 순서대로 나타내는 정수 배열
    :type food: list
    :return: 대회를 위한 음식의 배치를 나타내는 문자열
    :rtype: str
    """
    answer = "0"
    for i in range(len(food) - 1, 0, -1):
        c = int(food[i] / 2)
        while c > 0:
            answer = str(i) + answer + str(i)
            c -= 1
    return answer


print(solution([1, 3, 4, 6]))
print(solution([1, 7, 1, 2]))
