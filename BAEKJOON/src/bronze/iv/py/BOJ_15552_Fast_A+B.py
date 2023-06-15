# 빠른 A+B
import io
import os
import sys

inp = io.BytesIO(os.read(0, os.fstat(0).st_size)).readline
sys.stdout.write('\n'.join(str(sum(map(int, inp().split()))) for _ in range(int(inp()))))
