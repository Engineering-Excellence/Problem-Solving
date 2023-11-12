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
}

module.exports = Day5
console.log(Day5.prototype.process('abc1abc1abc'))
console.log(Day5.prototype.process(''))