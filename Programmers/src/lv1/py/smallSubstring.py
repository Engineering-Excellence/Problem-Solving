def solution(t: str, p: str) -> int:
    """
    크기가 작은 부분 문자열

    :param t: 숫자로 이루어진 문자열
    :type t: str
    :param p: 숫자로 이루어진 문자열
    :type p: str
    :return: t에서 p와 길이가 같은 부분문자열 중에서, 이 부분문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수
    :rtype: int
    """
    cnt = 0
    for i in range(len(t) - len(p) + 1):
        if int(t[i:i + len(p)]) <= int(p):
            cnt += 1
    return cnt


print(solution('3141592', '271'))
print(solution('500220839878', '7'))
print(solution('10203', '15'))
