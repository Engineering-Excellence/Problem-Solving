def solution(cards1: list, cards2: list, goal: list) -> str:
    """
    카드 뭉치

    :param cards1: 문자열로 이루어진 배열
    :type cards1: list
    :param cards2: 문자열로 이루어진 배열
    :type cards2: list
    :param goal: 원하는 단어 배열
    :type goal: list
    :return: cards1과 cards2에 적힌 단어들로 goal를 만들 있다면 "Yes"를, 만들 수 없다면 "No"를 반환
    :rtype: str
    """
    for s in goal:
        if cards1 and s == cards1[0]:
            cards1.pop(0)
        elif cards2 and s == cards2[0]:
            cards2.pop(0)
        else:
            return 'No'
    return 'Yes'


print(solution(cards1=["i", "drink", "water"], cards2=["want", "to"], goal=["i", "want", "to", "drink", "water"]))
print(solution(cards1=["i", "water", "drink"], cards2=["want", "to"], goal=["i", "want", "to", "drink", "water"]))
