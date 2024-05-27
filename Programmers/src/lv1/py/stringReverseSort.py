def solution(s: str) -> str:
    """
    문자열 내림차순으로 배치하기

    :param s: 문자열
    :type s: str
    :return: s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 반환
    :rtype: str
    """
    return ''.join(sorted(s, reverse=True))


print(solution("Zbcdefg"))
