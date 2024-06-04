def solution(x: int) -> bool:
    """
    하샤드 수

    :param x: 양의 정수
    :type x: int
    :return: x가 하샤드 수인지 아닌지 반환
    :rtype: bool
    """
    return x % sum(map(int, str(x))) == 0


print(solution(x=10))
print(solution(x=12))
print(solution(x=11))
print(solution(x=13))
