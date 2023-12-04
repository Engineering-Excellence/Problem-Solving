# 문자열
class Day10:
    # 문자열의 앞의 n글자
    def get_first_n_char(self, my_string, n):
        return my_string[:n] if n <= len(my_string) else my_string[-len(my_string):]


if __name__ == '__main__':
    day10 = Day10()
    print(day10.get_first_n_char("ProgrammerS123", 11))
    print(day10.get_first_n_char("He110W0r1d", 5))
