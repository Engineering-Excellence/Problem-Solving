package kr.co.programmers.lv1.java;

import java.util.Arrays;

// 최대공약수와 최소공배수
public class GCD_LCM {

    public int[] solution(int n, int m) {

        return new int[]{getGCD(n, m), n * m / getGCD(n, m)};
    }

    public int getGCD(int n, int m) {

        if (m == 0) return n;
        return getGCD(m, n % m);
    }

    public static void main(String[] args) {

        GCD_LCM gcdLcm = new GCD_LCM();

        System.out.println(Arrays.toString(gcdLcm.solution(3, 12)));
        System.out.println(Arrays.toString(gcdLcm.solution(2, 5)));
    }
}
