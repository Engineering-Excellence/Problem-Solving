# 문자열
class Day9:
    # 배열 만들기 5
    def make_array_5(self, intStrs, k, s, l):
        return [int(intStr[s:s + l]) for intStr in intStrs if int(intStr[s:s + l]) > k]

    # 부분 문자열 이어 붙여 문자열 만들기
    def make_str(self, my_strings, parts):
        # return ''.join([my_strings[i][parts[i][0]:parts[i][1] + 1] for i in range(len(my_strings))])
        # return ''.join(map(lambda x: my_strings[x[0]][x[1][0]:x[1][1] + 1], enumerate(parts)))
        return ''.join([my_string[part[0]:part[1] + 1] for my_string, part in zip(my_strings, parts)])

    # 문자열의 뒤의 n글자
    def get_last_n_char(self, my_string, n):
        return my_string[-n:] if n <= len(my_string) else my_string[-len(my_string):]


if __name__ == '__main__':
    day9 = Day9()
    print(day9.make_array_5(["0123456789", "9876543210", "9999999999999"], 50000, 5, 5))
    print(day9.make_str(["progressive", "hamburger", "hammer", "ahocorasick"], [[0, 4], [1, 2], [3, 5], [7, 7]]))
    print(day9.get_last_n_char("ProgrammerS123", 11))
    print(day9.get_last_n_char("He110W0r1d", 5))
