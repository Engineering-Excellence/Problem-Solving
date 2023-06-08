# 괄호
import sys


class Solution:
    @staticmethod
    def is_vps(ps):
        stack = []
        for c in ps:
            if c == '(':
                stack.append(c)
            else:
                if not stack:
                    return False
                stack.pop()
        return not stack


def main():
    for _ in range(int(sys.stdin.readline().strip())):
        print('YES' if Solution().is_vps(sys.stdin.readline().strip()) else 'NO')


if __name__ == '__main__':
    main()
