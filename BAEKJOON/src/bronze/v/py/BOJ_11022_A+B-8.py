# A+B - 8
import sys

inp = sys.stdin.readline
for i in range(1, int(inp()) + 1):
    A, B = map(int, inp().split())
    print(f'Case #{i}: {A} + {B} = {A + B}')
