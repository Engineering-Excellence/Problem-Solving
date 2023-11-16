# 조건문, 반복문
class Day6:
    # 수열과 구간 쿼리 3
    def sequence_and_query_3(self, arr, queries):
        for i, j in queries:
            arr[i], arr[j] = arr[j], arr[i]
        return arr


if __name__ == '__main__':
    day6 = Day6()
    print(day6.sequence_and_query_3([0, 1, 2, 3, 4], [[0, 3], [1, 2], [1, 4]]))
