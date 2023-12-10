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


if __name__ == '__main__':
    day11 = Day11()
    print(day11.count_alphabet('Programmers'))
    print(day11.make_array_1(10, 3))
    print(day11.make_array_1(15, 5))
