'use strict'

// 연산
class Day3 {
    // 문자열 섞기
    shuffleStr(str1, str2) {
        let str = ''
        for (let i = 0; i < str1.length; i++) {
            str = str.concat(str1[i], str2[i])
        }
        return str
    }

    // 문자 리스트를 문자열로 변환하기
    arrToStr(arr) {
        return arr.join('')
    }

    // 문자열 곱하기
    repeatStr(my_string, k) {
        return my_string.repeat(k)
    }

    // 더 크게 합치기
    greaterSum(a, b) {
        return Math.max(Number(`${a}${b}`), Number(`${b}${a}`))
    }

    // 두 수의 연산값 비교하기
    greaterOne(a, b) {
        return Math.max(Number(`${a}${b}`), 2 * a * b)
    }
}

const day3 = new Day3()
console.log(day3.shuffleStr('abc', '123'))
console.log(day3.arrToStr(['a', 'b', 'c']))
console.log(day3.repeatStr('string', 3))
console.log(day3.greaterSum(91, 9))
console.log(day3.greaterOne(2, 91))