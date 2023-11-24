# 반복문
class Day7:
    # 수열과 구간 쿼리 4
    @staticmethod
    def sequence_and_query_4(arr, queries):
        for s, e, k in queries:
            for i in range(s, e + 1):
                try:
                    if i % k == 0:
                        arr[i] += 1
                except ArithmeticError:
                    pass
        return arr

    # 카운트 업
    @staticmethod
    def count_up(start_num, end_num):
        return list(range(start_num, end_num + 1))

    # 콜라츠 수열 만들기
    @staticmethod
    def collatz_sequence(n):
        ans = [n]
        while n > 1:
            n = n // 2 if n % 2 == 0 else 3 * n + 1
            ans.append(n)
        return ans

    # 배열 만들기 2
    @staticmethod
    def make_array_2(l, r):
        ans = list()
        for i in range(l, r + 1):
            if not set(str(i)) - {'0', '5'}:
                ans.append(i)
        return ans if ans else [-1]


if __name__ == '__main__':
    day7 = Day7()
    print(day7.sequence_and_query_4([0, 1, 2, 4, 3], [[0, 4, 1], [0, 3, 2], [0, 3, 3]]))
    print(day7.count_up(3, 10))
    print(day7.collatz_sequence(10))
    print(day7.make_array_2(5, 555))
    print(day7.make_array_2(10, 20))
