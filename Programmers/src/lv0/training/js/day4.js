'use strict'

// 연산, 조건문
class Day4 {
    // n의 배수
    multiple(num, n) {
        return num % n == 0 ? 1 : 0
    }
}

const day4 = new Day4()
console.log(day4.multiple(98, 2))
console.log(day4.multiple(34, 3))