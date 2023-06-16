# A+B - 7
import io
import os
import sys

inp = io.BytesIO(os.read(0, os.fstat(0).st_size)).readline
sys.stdout.write('\n'.join(f'Case #{i}: {sum(map(int, inp().split()))}' for i in range(1, int(inp()) + 1)))
