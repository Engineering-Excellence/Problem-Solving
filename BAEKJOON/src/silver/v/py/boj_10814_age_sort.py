# 나이순 정렬
import sys
from operator import itemgetter

N = int(sys.stdin.readline())
user_list = list()
for _ in range(N):
    age, name = sys.stdin.readline().strip().split()
    user_list.append((int(age), name))
user_list.sort(key=itemgetter(0))
for user in user_list:
    print(*user)

# import sys
#
# class User:
#     def __init__(self, age, name):
#         self.age = age
#         self.name = name
#
#     def __lt__(self, other):
#         return self.age < other.age
#
# N = int(sys.stdin.readline())
# user_list = list()
# for _ in range(N):
#     age, name = sys.stdin.readline().strip().split()
#     user_list.append(User(int(age), name))
# user_list.sort()
# for user in user_list:
#     print(user.age, user.name)
