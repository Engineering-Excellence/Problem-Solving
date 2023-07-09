# 그룹 단어 체커
import sys


def is_group_word(word):
    for i in range(len(word) - 1):
        if word[i] == word[i + 1]:
            continue
        if word[i + 1] in word[:i]:
            return False
    return True


if __name__ == '__main__':
    N = int(sys.stdin.readline().rstrip())
    cnt = 0
    for _ in range(N):
        if is_group_word(sys.stdin.readline().rstrip()):
            cnt += 1
    print(cnt)
