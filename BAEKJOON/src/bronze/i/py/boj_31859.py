# SMUPC NAME

n, s = input().split()
ext = ''.join(dict.fromkeys(s)) # 중복 여부에 따라 문자열 추가, Python 3.7 이상에서 dict의 삽입 순서가 유지

print(f'{1906 + int(n)}{ext}{4 + len(s) - len(ext)}_cpums'[::-1])
