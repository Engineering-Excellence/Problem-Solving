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


if __name__ == '__main__':
    da12 = Day12()
    print(da12.slice_list(3, [1, 5, 2], [1, 2, 3, 4, 5, 6, 7, 8, 9]))
    print(da12.slice_list(4, [1, 5, 2], [1, 2, 3, 4, 5, 6, 7, 8, 9]))
