import sys

# A+B - 4
while True:
    try:
        A, B = map(int, sys.stdin.readline().split())
        print(A + B)
    except :
        break
