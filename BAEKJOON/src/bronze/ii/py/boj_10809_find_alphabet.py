import sys

# 알파벳 찾기

word = sys.stdin.readline().rstrip()
for i in range(97, 123):
    print(word.find(chr(i)), end=' ')
