# 크로아티아 알파벳
import sys
from functools import reduce

croatian = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']
word = sys.stdin.readline().rstrip()
print(len(reduce(lambda w, a: w.replace(a, '*'), croatian, word)))
