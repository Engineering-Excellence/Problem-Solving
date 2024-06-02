def solution(arr: list) -> list:
    """
    같은 숫자는 싫어

    :param arr: 숫자 0부터 9까지의 원소로 이루어진 배열
    :type arr: list
    :return: 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거 후 남은 수들을 배열 arr의 원소들의 순서를 유지하여 반환
    :rtype: list
    """
    answer = []
    for i in arr:
        if [i] != answer[-1:]:
            answer.append(i)
    return answer


print(solution([1, 1, 3, 3, 0, 1, 1]))
print(solution([4, 4, 4, 3, 3]))
