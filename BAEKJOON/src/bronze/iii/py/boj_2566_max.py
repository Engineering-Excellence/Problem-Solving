# 최댓값
import sys

inp = sys.stdin.readline
max_value = -1
x = y = 0
for i in range(9):
    row = list(map(int, inp().split()))
    max_row = max(row)
    if max_row > max_value:
        max_value = max_row
        x = i + 1
        y = row.index(max_value) + 1
print(f'{max_value}\n{x} {y}')
