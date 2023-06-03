import sys

# A+B - 3
T = int(sys.stdin.readline())
for _ in range(T):
    A, B = map(int, sys.stdin.readline().split())
    sys.stdout.write(str(A + B) + "\n")
sys.stdout.flush()
