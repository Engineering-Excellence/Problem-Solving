'use strict'

/* const rl = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
}) */

// 연산
class Day3 {
    // 문자열 섞기
    shuffleStr(str1, str2) {
        let str = ''
        for (let i = 0; i < str1.length; i++) {
            str += str1[i] + str2[i]
        }
        return str
    }
}

const day3 = new Day3()
console.log(day3.shuffleStr('abc', '123'))