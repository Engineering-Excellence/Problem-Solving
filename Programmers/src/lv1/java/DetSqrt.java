package lv1.java;

// 정수 제곱근 판별
public class DetSqrt {

    private long solution(long n) {

        return n % Math.sqrt(n) == 0 ? (long) Math.pow(Math.sqrt(n) + 1, 2) : -1;
    }

    public static void main(String[] args) {

        DetSqrt detSqrt = new DetSqrt();

        System.out.println(detSqrt.solution(121));
        System.out.println(detSqrt.solution(3));
    }
}
