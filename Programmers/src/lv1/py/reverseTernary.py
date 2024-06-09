def solution(n: int) -> int:
    """
    3진법 뒤집기

    :param n: 자연수
    :type n: int
    :return: n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수
    :rtype: int
    """
    tmp = []
    while n:
        n, r = divmod(n, 3)
        tmp.append(str(r))
    return int(''.join(tmp), 3)


print(solution(45))
print(solution(125))
