# 이진수 덧셈

from sys import stdin

for _ in range(int(stdin.readline())):
    bin1, bin2 = stdin.readline().split()
    print(bin(int(bin1, 2) + int(bin2, 2))[2:])