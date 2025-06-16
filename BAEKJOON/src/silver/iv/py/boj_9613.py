# GCD 합
from sys import stdin
from math import gcd
from itertools import combinations

for _ in range(int(stdin.readline())):
    combo = combinations(list(map(int, stdin.readline().split()))[1:], 2)
    print(sum([gcd(i, j) for i, j in combo]))
