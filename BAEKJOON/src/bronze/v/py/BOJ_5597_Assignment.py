# 과제 안 내신 분..?
import sys

students = [i for i in range(1, 31)]
for _ in range(28):
    students.remove(int(sys.stdin.readline()))
print(*students, sep='\n')
