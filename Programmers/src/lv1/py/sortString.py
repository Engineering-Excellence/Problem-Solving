def solution(strings: list, n: int) -> list:
    """
    문자열 내 마음대로 정렬하기

    :param strings: 문자열로 구성된 리스트
    :type strings: list
    :param n: 정수
    :type n: int
    :return: 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬한 리스트
    :rtype: list
    """
    return sorted(strings, key=lambda x: (x[n], x))


print(solution(strings=["sun", "bed", "car"], n=1))
print(solution(strings=["abce", "abcd", "cdx"], n=2))
