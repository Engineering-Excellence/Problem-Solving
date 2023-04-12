package kr.co.programmers.lv1;

import java.util.Arrays;

// 비밀지도
public class SecretMap {

    public String[] solution(int n, int[] arr1, int[] arr2) {

        String[] binArr = new String[n];

        for (int i = 0; i < n; i++) {
            binArr[i] = String.format("%" + n + "s", Integer.toBinaryString(arr1[i] | arr2[i]));
        }

        return Arrays.stream(binArr).map(s -> s.replace("1", "#").replace("0", " ")).toArray(String[]::new);
    }

    public static void main(String[] args) {

        SecretMap secretMap = new SecretMap();

        System.out.println(Arrays.toString(secretMap.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28})));
    }
}
