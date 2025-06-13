from sys import stdin


def solution(n: int, k: int, p: list[int], t: list[int]) -> int:
    """
    플래그 대사 그만 좀 말해요

    :param n 부하의 수
    :param k 한별이의 목소리의 크기
    :param p n명의 부하들의 현재 강함
    :param t n명의 부하들의 목표 강함
    :return 한별이가 부하들을 모두 목표 수치 이상으로 강화시키기 위하여 필요한 외침의 최소 횟수
    """
    from collections import deque

    additional_power = [0] * (n + 1)
    speech = deque([0] * k)
    effective_shout = 0
    shout = 0

    for i in range(1, n + 1):
        additional_power[i] = additional_power[i - 1] - effective_shout
        p[i] += additional_power[i]
        count = max(0, (t[i] - p[i] + k - 1) // k)
        shout += count
        effective_shout += count
        speech.append(count)
        additional_power[i] += count * k
        p[i] += count * k
        effective_shout -= speech.popleft()

    return shout


if __name__ == '__main__':
    n, k = map(int, stdin.readline().split())
    p = [0] + list(map(int, stdin.readline().split()))
    t = [0] + list(map(int, stdin.readline().split()))

    print(solution(n, k, p, t))
