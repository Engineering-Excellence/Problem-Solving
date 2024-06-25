def solution(number: int, limit: int, power: int) -> int:
    """
    기사단원의 무기

    :param number: 기사단원의 수를 나타내는 정수
    :type number: int
    :param limit: 이웃나라와 협약으로 정해진 공격력의 제한수치를 나타내는 정수
    :type limit: int
    :param power: 제한수치를 초과한 기사가 사용할 무기의 공격력을 나타내는 정수
    :type power: int
    :return: 무기점의 주인이 무기를 모두 만들기 위해 필요한 철의 무게
    :rtype: int
    """
    atk = []
    for i in range(1, number + 1):
        divisors = set()
        for j in range(1, int(i ** 0.5) + 1):
            if i % j == 0:
                divisors.add(j)
                divisors.add(i // j)
        atk.append(power if len(divisors) > limit else len(divisors))
    return sum(atk)


print(solution(number=5, limit=3, power=2))
print(solution(number=10, limit=3, power=2))
