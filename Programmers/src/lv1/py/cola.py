def solution(a: int, b: int, n: int) -> int:
    """
    콜라 문제

    :param a: 콜라를 받기 위해 마트에 주어야 하는 병 수
    :type a: int
    :param b: 빈 병 a개를 가져다 주면 마트가 주는 콜라 병 수
    :type b: int
    :param n: 상빈이가 가지고 있는 빈 병의 개수
    :type n: int
    :return: 상빈이가 받을 수 있는 콜라의 병 수
    :rtype: int
    """
    return (n - b) // (a - b) * b


print(solution(a=2, b=1, n=20))
print(solution(a=3, b=1, n=20))
