def solution(name: list, yearning: list, photo: list) -> list:
    """
    추억 점수

    :param name: 그리워하는 사람의 이름을 담은 문자열 배열
    :type name: list
    :param yearning: 각 사람별 그리움 점수를 담은 정수 배열
    :type yearning: list
    :param photo: 각 사진에 찍힌 인물의 이름을 담은 이차원 문자열 배열
    :type photo: list
    :return: 사진들의 추억 점수
    :rtype: list
    """
    yearn = dict(zip(name, yearning))
    return [sum(yearn.get(person, 0) for person in people) for people in photo]


print(solution(name=["may", "kein", "kain", "radi"], yearning=[5, 10, 1, 3], photo=[["may", "kein", "kain", "radi"], ["may", "kein", "brin", "deny"], ["kon", "kain", "may", "coni"]]))
print(solution(name=["kali", "mari", "don"], yearning=[11, 1, 55], photo=[["kali", "mari", "don"], ["pony", "tom", "teddy"], ["con", "mona", "don"]]))
print(solution(name=["may", "kein", "kain", "radi"], yearning=[5, 10, 1, 3], photo=[["may"], ["kein", "deny", "may"], ["kon", "coni"]]))
