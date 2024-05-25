def solution(s: str) -> str:
    """
    가운데 글자 가져오기

    :param s: 길이가 1 이상, 100이하인 스트링
    :type s: str
    :return: 단어 s의 가운데 글자를 반환
    :rtype: str
    """
    return s[(len(s) - 1) // 2: len(s) // 2 + 1]


print(solution("abcde"))
print(solution("qwer"))
