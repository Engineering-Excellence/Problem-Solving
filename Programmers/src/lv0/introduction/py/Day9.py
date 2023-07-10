# 수학, 문자열, 해시, 완전탐색, 조건문
class Day9:
    # 개미 군단
    def ant_corps(self, hp):
        cnt = 0
        for ant in [5, 3, 1]:
            q, hp = divmod(hp, ant)
            cnt += q
        return cnt


if __name__ == '__main__':
    day9 = Day9()
    print(day9.ant_corps(23))
    print(day9.ant_corps(24))
    print(day9.ant_corps(999))
