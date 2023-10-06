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
            let values = line.split(' ')
            console.log(`a = ${values[0]}\nb = ${values[1]}`)
        })
    }

    // 문자열 반복해서 출력하기
    printRepeat() {
        rl.on('line', line => {
            let values = line.split(' ')
            console.log(values[0].repeat(values[1]))
        })
    }

    // 대소문자 바꿔서 출력하기
    changeCase() {
        rl.on('line', line => console.log(line.replace(/\w/g, c => c.toUpperCase() === c ? c.toLowerCase() : c.toUpperCase())))
    }
}

const day1 = new Day1()
// day1.printStr()
// day1.printSplit()
// day1.printRepeat()
day1.changeCase()