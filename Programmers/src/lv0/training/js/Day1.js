'use strict'

const rl = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
})

// 출력
class Day1 {
    // 문자열 출력하기
    printStr() {
        rl.on('line', console.log)
    }

    // a와 b 출력하기
    printSplit() {
        rl.on('line', line => {
            const values = line.split(' ')
            console.log(`a = ${values[0]}\nb = ${values[1]}`)
        })
    }
}

const day1 = new Day1()
day1.printStr()
day1.printSplit()