# 바이러스
import sys
# from collections import deque


# def bfs(graph, root, visited):
#     queue = deque([root])
#     visited[root] = True
#     while queue:
#         v = queue.popleft()
#         for i in graph[v]:
#             if not visited[i]:
#                 queue.append(i)
#                 visited[i] = True
#     return visited.count(True) - 1


def dfs(graph, root, visited=None):
    if visited is None:
        visited = []
    visited.append(root)
    for node in graph[root]:
        if node not in visited:
            dfs(graph, node, visited)
    return len(visited) - 1


n = int(sys.stdin.readline())
m = int(sys.stdin.readline())
graph = [[] for _ in range(n + 1)]
# visited = [False] * (n + 1)
for _ in range(m):
    a, b = map(int, sys.stdin.readline().split())
    graph[a].append(b)
    graph[b].append(a)
# print(bfs(graph, 1, visited))
print(dfs(graph, 1))
