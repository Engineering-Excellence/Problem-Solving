package kr.co.programmers.lv1;

// 짝수와 홀수
// 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
public class EvenOdd {

    private String solution(int num) {

        return num % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {

        EvenOdd evenOdd = new EvenOdd();
        System.out.println(evenOdd.solution(3));
        System.out.println(evenOdd.solution(4));
    }
}
