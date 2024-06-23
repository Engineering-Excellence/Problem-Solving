def solution(nums: list) -> int:
    """
    폰켓몬

    :param nums: 폰켓몬의 종류 번호가 담긴 1차원 배열
    :type nums: list
    :return: N마리 폰켓몬의 종류 번호가 담긴 배열 nums가 매개변수로 주어질 때, N/2마리의 폰켓몬을 선택하는 방법 중, 가장 많은 종류의 폰켓몬을 선택하는 방법을 찾아, 그때의 폰켓몬 종류 번호의 개수를 반환
    :rtype: int
    """
    return min(len(set(nums)), len(nums) // 2)


print(solution(nums=[3, 1, 2, 3]))
print(solution(nums=[3, 3, 3, 2, 2, 4]))
print(solution(nums=[3, 3, 3, 2, 2, 2]))
