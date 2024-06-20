def solution(k: int, score: list) -> list:
    """
    명예의 전당 (1)

    :param k: 명예의 전당 목록의 점수의 개수
    :type k: int
    :param score: 1일부터 마지막 날까지 출연한 가수들의 점수
    :type score: list
    :return: 매일 발표된 명예의 전당의 최하위 점수
    :rtype: list
    """
    answer = []
    tmp = []
    for i in score:
        tmp.append(i)
        if len(tmp) > k:
            tmp.remove(min(tmp))
        answer.append(min(tmp))
    return answer


print(solution(k=3, score=[10, 100, 20, 150, 1, 100, 200]))
print(solution(k=4, score=[0, 300, 40, 300, 20, 70, 150, 50, 500, 1000]))
