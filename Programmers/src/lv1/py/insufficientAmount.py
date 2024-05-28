def solution(price: int, money: int, count: int) -> int:
    """
    부족한 금액 계산하기

    :param price: 놀이기구의 원래 이용료
    :type price: int
    :param money: 처음 가지고 있던 금액
    :type money: int
    :param count: 놀이기구의 이용 횟수
    :type count: int
    :return: 놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 반환
    :rtype: int
    """
    return max(-money + count * (count + 1) // 2 * price, 0)


print(solution(3, 20, 4))
