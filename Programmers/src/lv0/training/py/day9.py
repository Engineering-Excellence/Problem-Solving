# 문자열
class Day9:
    # 배열 만들기 5
    def make_array_5(self, intStrs, k, s, l):
        return [int(intStr[s:s + l]) for intStr in intStrs if int(intStr[s:s + l]) > k]


if __name__ == '__main__':
    day9 = Day9()
    print(day9.make_array_5(["0123456789", "9876543210", "9999999999999"], 50000, 5, 5))
