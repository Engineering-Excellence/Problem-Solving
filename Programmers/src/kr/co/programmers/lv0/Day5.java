package kr.co.programmers.lv0;

import java.time.LocalDate;
import java.util.Arrays;

// 수학, 배열
public class Day5 {

    // 옷가게 할인 받기
    private int discount(int price) {

        if (price >= 500000) {
            price *= 0.8;
        } else if (price >= 300000){
            price *= 0.9;
        } else if (price >= 100000) {
            price *= 0.95;
        }

        return price;
    }

    // 아이스 아메리카노
    private int[] americano(int money) {

        return new int[]{money / 5500, money % 5500};
    }

    // 나이 출력
    private int birth(int age) {

        LocalDate today = LocalDate.now();
        return today.getYear() - age + 1;
    }

    public static void main(String[] args) {

        Day5 day5 = new Day5();

        System.out.println(day5.discount(150000));
        System.out.println(day5.discount(580000));

        System.out.println("=================================================");

        System.out.println(Arrays.toString(day5.americano(5500)));
        System.out.println(Arrays.toString(day5.americano(15000)));

        System.out.println("=================================================");

        System.out.println(day5.birth(35));
        System.out.println(day5.birth(23));
    }
}
