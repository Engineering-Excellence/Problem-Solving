package lv0.training.java;

import java.util.Arrays;

// 조건문, 반복문
public class Day6 {
    // 마지막 두 원소
    private int[] finalTwoElements(int[] num_list) {
        int l = num_list.length;
        int[] ans = Arrays.copyOf(num_list, l + 1);
        ans[l] = num_list[l - 1] > num_list[l - 2] ? num_list[l - 1] - num_list[l - 2] : 2 * num_list[l - 1];
        return ans;
    }

    public static void main(String[] args) {
        Day6 day6 = new Day6();
        System.out.println(Arrays.toString(day6.finalTwoElements(new int[]{2, 1, 6})));
        System.out.println(Arrays.toString(day6.finalTwoElements(new int[]{5, 2, 1, 7, 5})));
    }
}
