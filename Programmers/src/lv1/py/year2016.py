def solution(a: int, b: int) -> str:
    """
    2016년

    :param a: 월
    :type a: int
    :param b: 일
    :type b: int
    :return: 2016년 a월 b일이 무슨 요일인지 반환
    :rtype: str
    """
    months = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    days = ['FRI', 'SAT', 'SUN', 'MON', 'TUE', 'WED', 'THU']
    return days[(sum(months[:a - 1]) + b - 1) % 7]


print(solution(a=5, b=24))
