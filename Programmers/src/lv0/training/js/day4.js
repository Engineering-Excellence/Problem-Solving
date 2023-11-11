'use strict'

// 연산, 조건문
class Day4 {
    // n의 배수
    multiple(num, n) {
        return num % n == 0 ? 1 : 0
    }

    // 공배수
    commonMultiple(number, n, m) {
        return number % n == 0 && number % m == 0 ? 1 : 0
    }

    // 홀짝에 따라 다른 값 반환하기
    evenOdd(n) {
        return n % 2 == 0 ? n * (n + 1) * (n + 2) / 6 : Math.pow(Math.ceil(n / 2), 2)
    }

    // 조건 문자열
    condStr(ineq, eq, n, m) {
        return eval(`${n} ${ineq}${eq} ${m}`.replace('!', '')) ? 1 : 0
    }
}

const day4 = new Day4()
console.log(day4.multiple(98, 2))
console.log(day4.multiple(34, 3))
console.log(day4.commonMultiple(60, 2, 3))
console.log(day4.commonMultiple(55, 10, 5))
console.log(day4.evenOdd(7))
console.log(day4.evenOdd(10))
console.log(day4.condStr('<', '=', 20, 50))
console.log(day4.condStr('>', '!', 41, 78))