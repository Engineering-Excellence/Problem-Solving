# 리스트(배열)
class Day11:
    # 문자 개수 세기
    @staticmethod
    def count_alphabet(my_string):
        ans = [0] * 52
        for c in my_string:
            ans[ord(c) - (65 if c.isupper() else 71)] += 1
        return ans

    # 배열 만들기 1
    @staticmethod
    def make_array_1(n, k):
        return [i for i in range(k, n + 1, k)]

    # 글자 지우기
    @staticmethod
    def erase_char(my_string, indices):
        chars = list()
        for i in range(len(my_string)):
            if i not in indices:
                chars.append(my_string[i])
        return ''.join(chars)

    # 카운트 다운
    @staticmethod
    def count_down(start_num, end_num):
        return list(range(start_num, end_num - 1, -1))


if __name__ == '__main__':
    day11 = Day11()
    print(day11.count_alphabet('Programmers'))
    print(day11.make_array_1(10, 3))
    print(day11.make_array_1(15, 5))
    print(day11.erase_char('apporoograpemmemprs', [1, 16, 6, 15, 0, 10, 11, 3]))
    print(day11.count_down(10, 3))
