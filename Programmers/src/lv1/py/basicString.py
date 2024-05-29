def solution(s: str) -> bool:
    """
    문자열 다루기 기본

    :param s: 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 이루어진 길이 1 이상, 길이 8 이하인 문자열
    :type s: str
    :return: 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 반환
    :rtype: bool
    """
    return s.isdigit() and len(s) in [4, 6]


print(solution("a234"))
print(solution("1234"))
