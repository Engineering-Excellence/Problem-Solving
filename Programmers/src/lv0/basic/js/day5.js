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

    // 주사위 게임 2
    diceGame2(a, b, c) {
        const n = new Set([a, b, c]).size
        let res = 1
        for (let i = 1; i <= 4 - n; i++) {
            res *= a ** i + b ** i + c ** i
        }
        return res
    }

    // 원소들의 곱과 합
    multiplyAndSum(num_list) {
        let mul = num_list.reduce((a, c) => a * c, 1)
        let sum = num_list.reduce((a, c) => a + c, 0)
        return mul < sum ** 2 ? 1 : 0
    }

    // 이어 붙인 수
    pasteNum(num_list) {
        let even = ''
        let odd = ''
        num_list.forEach(n => n % 2 ? even += n.toString() : odd += n.toString())
        return parseInt(even) + parseInt(odd)
    }
}

module.exports = Day5
console.log(Day5.prototype.process('abc1abc1abc'))
console.log(Day5.prototype.process(''))
console.log(Day5.prototype.addArithmeticSequence(3, 4, [true, false, false, true, true]))
console.log(Day5.prototype.addArithmeticSequence(7, 1, [false, false, false, true, false, false, false]))
console.log(Day5.prototype.diceGame2(2, 6, 1))
console.log(Day5.prototype.diceGame2(5, 3, 3))
console.log(Day5.prototype.diceGame2(4, 4, 4))
console.log(Day5.prototype.multiplyAndSum([3, 4, 5, 2, 1]))
console.log(Day5.prototype.multiplyAndSum([5, 7, 8, 3]))
console.log(Day5.prototype.pasteNum([3, 4, 5, 2, 1]))
console.log(Day5.prototype.pasteNum([5, 7, 8, 3]))