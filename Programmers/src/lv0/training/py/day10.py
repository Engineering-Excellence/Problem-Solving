# 문자열
class Day10:
    # 문자열의 앞의 n글자
    @staticmethod
    def get_first_n_char(my_string, n):
        return my_string[:n] if n <= len(my_string) else my_string[-len(my_string):]

    # 접두사인지 확인하기
    @staticmethod
    def is_prefix(my_string, is_prefix):
        return int(my_string.startswith(is_prefix))

    # 문자열 뒤집기
    @staticmethod
    def revers_string(my_string, s, e):
        return my_string.replace(my_string[s:e + 1], my_string[s:e + 1][::-1], 1)

    # 세로 읽기
    @staticmethod
    def vertical_read(my_string, m, c):
        return my_string[c - 1::m]

    # qr code
    @staticmethod
    def qr_code(q, r, code):
        # return ''.join([code[i] for i in filter(lambda x: x % q == r, range(len(code)))])
        return code[r::q]


if __name__ == '__main__':
    day10 = Day10()
    print(day10.get_first_n_char("ProgrammerS123", 11))
    print(day10.get_first_n_char("He110W0r1d", 5))
    print(day10.is_prefix("banana", "ban"))
    print(day10.is_prefix("banana", "nan"))
    print(day10.is_prefix("banana", "abcd"))
    print(day10.is_prefix("banana", "bananan"))
    print(day10.revers_string("Progra21Sremm3", 6, 12))
    print(day10.revers_string("Stanley1yelnatS", 4, 10))
    print(day10.vertical_read("ihrhbakrfpndopljhygc", 4, 2))
    print(day10.vertical_read("programmers", 1, 1))
    print(day10.qr_code(3, 1, "qjnwezgrpirldywt"))
    print(day10.qr_code(1, 0, "programmers"))
