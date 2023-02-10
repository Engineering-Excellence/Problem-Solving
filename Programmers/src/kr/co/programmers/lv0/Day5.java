package kr.co.programmers.lv0;

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

    public static void main(String[] args) {

        Day5 day5 = new Day5();

        System.out.println(day5.discount(150000));
        System.out.println(day5.discount(580000));

        System.out.println("=================================================");
    }
}
