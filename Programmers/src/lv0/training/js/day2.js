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
}

const day2 = new Day2()
day2.printAdd()