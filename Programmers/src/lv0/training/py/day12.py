# 리스트(배열)
class Day12:
    # 리스트 자르기
    @staticmethod
    def slice_list(n, slicer, num_list):
        match n:
            case 1:
                return num_list[:slicer[1] + 1]
            case 2:
                return num_list[slicer[0]:]
            case 3:
                return num_list[slicer[0]:slicer[1] + 1]
            case 4:
                return num_list[slicer[0]:slicer[1] + 1:slicer[2]]

    # 첫 번째로 나오는 음수
    @staticmethod
    def first_negative(num_list):
        for i in range(len(num_list)):
            if num_list[i] < 0:
                return i
        return -1

    # 배열 만들기 3
    @staticmethod
    def make_array_3(arr, intervals):
        return arr[intervals[0][0]:intervals[0][1] + 1] + arr[intervals[1][0]:intervals[1][1] + 1]


if __name__ == '__main__':
    da12 = Day12()
    print(da12.slice_list(3, [1, 5, 2], [1, 2, 3, 4, 5, 6, 7, 8, 9]))
    print(da12.slice_list(4, [1, 5, 2], [1, 2, 3, 4, 5, 6, 7, 8, 9]))
    print(da12.first_negative([12, 4, 15, 46, 38, -2, 15]))
    print(da12.first_negative([13, 22, 53, 24, 15, 6]))
    print(da12.make_array_3([1, 2, 3, 4, 5], [[1, 3], [0, 4]]))
