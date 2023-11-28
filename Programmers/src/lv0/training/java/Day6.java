package lv0.training.java;

import java.util.Arrays;

// 조건문, 반복문
class Day6 {
    // 마지막 두 원소
    private int[] finalTwoElements(int[] num_list) {
        int l = num_list.length;
        int[] ans = Arrays.copyOf(num_list, l + 1);
        ans[l] = num_list[l - 1] > num_list[l - 2] ? num_list[l - 1] - num_list[l - 2] : 2 * num_list[l - 1];
        return ans;
    }

    // 수 조작하기 1
    private int manipulateNumber1(int n, String control) {
        return control.chars().reduce(n, (acc, c) -> {
            switch (c) {
                case 'w' -> acc += 1;
                case 's' -> acc += -1;
                case 'd' -> acc += 10;
                case 'a' -> acc += -10;
                default -> throw new IllegalArgumentException("Wrong Input");
            }
            return acc;
        });
    }

    // 수 조작하기 2
    private String manipulateNumber2(int[] numLog) {
        StringBuilder ans = new StringBuilder();
        for (int i = 1; i < numLog.length; i++) {
            String c;
            switch (numLog[i] - numLog[i - 1]) {
                case 1 -> c = "w";
                case -1 -> c = "s";
                case 10 -> c = "d";
                case -10 -> c = "a";
                default -> c = "";
            }
            ans.append(c);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Day6 day6 = new Day6();
        System.out.println(Arrays.toString(day6.finalTwoElements(new int[]{2, 1, 6})));
        System.out.println(Arrays.toString(day6.finalTwoElements(new int[]{5, 2, 1, 7, 5})));
        System.out.println(day6.manipulateNumber1(0, "wsdawsdassw"));
        System.out.println(day6.manipulateNumber2(new int[]{0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1}));
    }
}
