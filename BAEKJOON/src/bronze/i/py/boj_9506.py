# 약수들의 합

answer: list[str] = []
while True:
    n: int = int(input())
    if n == -1:
        break
    else:
        divisors: list[int] = [1]
        for i in range(2, n//2 + 1):
            if n % i == 0:
                divisors.append(i)
        if n != sum(divisors):
            answer.append(f"{n} is NOT perfect.")
        else:
            answer.append(f"{n} = ")
            answer.append(" + ".join([str(d) for d in divisors]))
        answer.append('\n')
# print(*answer, sep='')
print("".join(answer))