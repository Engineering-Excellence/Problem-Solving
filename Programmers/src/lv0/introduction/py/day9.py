# 수학, 문자열, 해시, 완전탐색, 조건문
import math


class Day9:
    # 개미 군단
    def ant_corps(self, hp):
        cnt = 0
        for ant in [5, 3, 1]:
            q, hp = divmod(hp, ant)
            cnt += q
        return cnt

    # 모스부호 (1)
    def morse_code(self, letter):
        morse = {
            '.-': 'a', '-...': 'b', '-.-.': 'c', '-..': 'd', '.': 'e', '..-.': 'f',
            '--.': 'g', '....': 'h', '..': 'i', '.---': 'j', '-.-': 'k', '.-..': 'l',
            '--': 'm', '-.': 'n', '---': 'o', '.--.': 'p', '--.-': 'q', '.-.': 'r',
            '...': 's', '-': 't', '..-': 'u', '...-': 'v', '.--': 'w', '-..-': 'x',
            '-.--': 'y', '--..': 'z'
        }
        return ''.join([morse[i] for i in letter.split()])

    # 가위 바위 보
    def rock_scissors_paper(self, rsp):
        return rsp.translate(str.maketrans('025', '502'))

    # 구슬을 나누는 경우의 수
    def share_bead(self, balls, share):
        return math.comb(balls, share)


if __name__ == '__main__':
    day9 = Day9()
    print(day9.ant_corps(23))
    print(day9.ant_corps(24))
    print(day9.ant_corps(999))
    print('=' * 80)
    print(day9.morse_code(".... . .-.. .-.. ---"))
    print(day9.morse_code(".--. -.-- - .... --- -."))
    print('=' * 80)
    print(day9.rock_scissors_paper("2"))
    print(day9.rock_scissors_paper("2050"))
    print('=' * 80)
    print(day9.share_bead(3, 2))
    print(day9.share_bead(5, 3))
