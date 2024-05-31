def solution(arr1: list, arr2: list) -> list:
    """
    행렬의 덧셈

    :param arr1: 행렬
    :type arr1: list
    :param arr2: 행렬
    :type arr2: list
    :return: 행렬 덧셈의 결과를 반환
    :rtype: list
    """
    return [[c + d for c, d in zip(a, b)] for a, b in zip(arr1, arr2)]


print(solution([[1, 2], [2, 3]], [[3, 4], [5, 6]]))
print(solution([[1], [2]], [[3], [4]]))
