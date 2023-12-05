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


if __name__ == '__main__':
    day10 = Day10()
    print(day10.get_first_n_char("ProgrammerS123", 11))
    print(day10.get_first_n_char("He110W0r1d", 5))
    print(day10.is_prefix("banana", "ban"))
    print(day10.is_prefix("banana", "nan"))
    print(day10.is_prefix("banana", "abcd"))
    print(day10.is_prefix("banana", "bananan"))
