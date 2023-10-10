'use strict'

const rl = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
})

// 출력, 연산
class Day2 {
    // 덧셈식 출력하기
    printAdd() {
        rl.on('line', line => {
            let values = line.split(' ')
            let a = Number(values[0])
            let b = Number(values[1])
            console.log(`${a} + ${b} = ${a + b}`)
        })
    }

    // 문자열 붙여서 출력하기
    concatStr() {
        rl.on('line', line => {
            let strs = line.split(' ')
            // console.log(strs[0].concat(strs[1]))
            console.log(strs.join(''))
        })
    }
}

const day2 = new Day2()
day2.printAdd()
day2.concatStr()