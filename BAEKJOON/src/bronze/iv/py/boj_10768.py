# 특별한 날

special: tuple[int, int] = 2, 18
today: tuple[int, int] = int(input()), int(input())

if special > today:
    print("Before")
elif special < today:
    print("After")
else:
    print("Special")
