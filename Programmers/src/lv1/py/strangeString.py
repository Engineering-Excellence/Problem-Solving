def solution(s: str) -> str:
    """
    이상한 문자 만들기

    :param s: 한 개 이상의 단어로 구성된 문자열
    :type s: str
    :return: 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열
    :rtype: str
    """
    tmp = []
    for word in s.split(sep=' '):
        for i, w in enumerate(word):
            tmp.append(w.lower() if i % 2 else w.upper())
        tmp.append(' ')
    tmp.pop(-1)
    return ''.join(tmp)


print(solution(s="try hello world"))
