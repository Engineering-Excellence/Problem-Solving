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
}

const day4 = new Day4()
console.log(day4.multiple(98, 2))
console.log(day4.multiple(34, 3))
console.log(day4.commonMultiple(60, 2, 3))
console.log(day4.commonMultiple(55, 10, 5))