# 요세푸스 문제 0
# import sys
# from collections import deque
#
# N, K = map(int, sys.stdin.readline().rstrip().split())
# queue = deque(i for i in range(1, N + 1))
# sys.stdout.write('<')
# while queue:
#     queue.rotate(-(K - 1))
#     sys.stdout.write(str(queue.popleft()))
#     if queue:
#         sys.stdout.write(', ')
# sys.stdout.write('>')

import sys
from collections import deque


def josephus(n, k):
    queue = deque(i for i in range(1, n + 1))
    result = []
    while queue:
        queue.rotate(-(k - 1))
        result.append(str(queue.popleft()))
    return '<' + ', '.join(result) + '>'


N, K = map(int, sys.stdin.readline().rstrip().split())
print(josephus(N, K))
