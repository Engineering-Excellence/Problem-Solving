# 조건문, 문자열
class Day8:
    # 글자 이어 붙여 문자열 만들기
    def concat_str(self, my_string, index_list):
        return ''.join([my_string[i] for i in index_list])


if __name__ == '__main__':
    day8 = Day8()
    print(day8.concat_str('cvsgiorszzzmrpaqpe', [16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7]))
    print(day8.concat_str('zpiaz', [1, 2, 0, 0, 3]))
