package lv0.training.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

// 조건문, 문자열
public class Day8 {

    // 주사위 게임 3
    private int diceGame3(int a, int b, int c, int d) {
        int ans = 0;
        int[] dice = Arrays.stream(new int[]{a, b, c, d}).sorted().toArray();
        Map<Integer, Integer> diceMap = new HashMap<>();
        Map<Integer, Integer> reverseMap = new HashMap<>();
        Arrays.stream(dice).forEach(i -> {
            diceMap.put(i, (int) Arrays.stream(dice).filter(v -> v == i).count());
            reverseMap.put((int) Arrays.stream(dice).filter(v -> v == i).count(), i);
        });

        switch (Collections.max(diceMap.values())) {
            case 1 -> ans = Arrays.stream(dice).min().orElse(0);
            case 2 -> {
                if (Arrays.stream(dice).boxed().collect(Collectors.toSet()).size() == 2) {
                    int p = dice[1];
                    int q = dice[2];
                    ans = (p + q) * Math.abs(p - q);
                } else {
                    ans = 1;
                    for (Map.Entry<Integer, Integer> entry : diceMap.entrySet()) {
                        if (entry.getValue().equals(1)) ans *= entry.getKey();
                    }
                }
            }
            case 3 -> {
                int p = reverseMap.get(3);
                int q = reverseMap.get(1);
                ans = (int) Math.pow(10 * p + q, 2);
            }
            case 4 -> {
                int p = reverseMap.get(4);
                ans = 1111 * p;
            }
            default -> {
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Day8 day8 = new Day8();
        System.out.println(day8.diceGame3(2, 2, 2, 2));
        System.out.println(day8.diceGame3(4, 1, 4, 4));
        System.out.println(day8.diceGame3(6, 3, 3, 6));
        System.out.println(day8.diceGame3(2, 5, 2, 6));
        System.out.println(day8.diceGame3(6, 4, 2, 5));
    }
}
