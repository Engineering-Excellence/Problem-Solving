'use strict'

// 조건문
class Day5 {
    // 코드 처리하기
    process(code) {
        let mode = 0
        let ret = ''
        for (let idx = 0; idx < code.length; idx++) {
            if (code[idx] === '1') {
                mode = (mode + 1) % 2
            } else if (!mode && !(idx % 2) || mode && (idx % 2)) {
                ret += code[idx]
            }
        }
        return ret.length ? ret : 'EMPTY'
    }

    // 등차수열의 특정한 항만 더하기
    addArithmeticSequence(a, d, included) {
        let sum = 0
        for (let i = 0; i < included.length; i++) {
            if (included[i]) {
                sum += a + d * i
            }
        }
        return sum
    }
}

module.exports = Day5
console.log(Day5.prototype.process('abc1abc1abc'))
console.log(Day5.prototype.process(''))
console.log(Day5.prototype.addArithmeticSequence(3, 4, [true, false, false, true, true]))
console.log(Day5.prototype.addArithmeticSequence(7, 1, [false, false, false, true, false, false, false]))