# 세로 읽기
import sys

inp = sys.stdin.readline
board = list()
length = list()
for _ in range(5):
    word = inp().rstrip()
    board.append(word)
    length.append(len(word))
for x in range(max(length)):
    for y in range(5):
        try:
            print(board[y][x], end='')
        except IndexError:
            continue
