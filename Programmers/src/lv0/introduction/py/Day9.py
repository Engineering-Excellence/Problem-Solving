# 수학, 문자열, 해시, 완전탐색, 조건문

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


if __name__ == '__main__':
    day9 = Day9()
    print(day9.ant_corps(23))
    print(day9.ant_corps(24))
    print(day9.ant_corps(999))
    print('=' * 80)
    print(day9.morse_code(".... . .-.. .-.. ---"))
    print(day9.morse_code(".--. -.-- - .... --- -."))
    print('=' * 80)
