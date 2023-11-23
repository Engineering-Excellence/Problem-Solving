# 반복문
class Day7:
    # 수열과 구간 쿼리 4
    def sequence_and_query_4(self, arr, queries):
        for s, e, k in queries:
            for i in range(s, e + 1):
                try:
                    if i % k == 0:
                        arr[i] += 1
                except ArithmeticError:
                    pass
        return arr


    # 카운트 업
    def count_up(self, start_num, end_num):
        return list(range(start_num, end_num + 1))


if __name__ == '__main__':
    day7 = Day7()
    print(day7.sequence_and_query_4([0, 1, 2, 4, 3], [[0, 4, 1], [0, 3, 2], [0, 3, 3]]))
    print(day7.count_up(3, 10))
