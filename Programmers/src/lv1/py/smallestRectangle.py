def solution(sizes: list) -> int:
    """
    최소직사각형

    :param sizes: 모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열
    :type sizes: list
    :return: 모든 명함을 수납할 수 있는 가장 작은 지갑의 크기
    :rtype: int
    """
    x, y = 0, 0
    for size in sizes:
        size.sort()
        x, y = max(x, size[0]), max(y, size[1])
    return x * y


print(solution(sizes=[[60, 50], [30, 70], [60, 30], [80, 40]]))
print(solution(sizes=[[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]))
print(solution(sizes=[[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]]))
