package kr.co.programmers.lv1;

// 두 정수 사이의 합
public class SumInts {

    public long solution(int a, int b) {

        return (long) (Math.abs(a - b) + 1) * (a + b) / 2;
    }

    public static void main(String[] args) {

        SumInts sumInts = new SumInts();

        System.out.println(sumInts.solution(3, 5));
        System.out.println(sumInts.solution(3, 3));
        System.out.println(sumInts.solution(5, 3));
    }
}
