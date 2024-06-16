def solution(s: str) -> list:
    """
    가장 가까운 같은 글자

    :param s: 문자열
    :type s: str
    :return: s의 각 위치마다 자신보다 앞에 나왔으면서, 자신과 가장 가까운 곳에 있는 같은 글자의 인덱스 리스트
    :rtype: list
    """
    answer = []
    dic = dict()
    for i in range(len(s)):
        if s[i] not in dic:
            answer.append(-1)
        else:
            answer.append(i - dic[s[i]])
        dic[s[i]] = i
    return answer


print(solution("banana"))
print(solution("foobar"))
