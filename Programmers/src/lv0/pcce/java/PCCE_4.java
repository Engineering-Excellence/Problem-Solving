package lv0.pcce.java;

import java.util.Scanner;

/**
 * <h1>[PCCE 기출문제] 4번 / 저축</h1>
 *
 * @author Kyle
 * @since 2023.12.26.
 */
public class PCCE_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int before = sc.nextInt();
        int after = sc.nextInt();

        int money = start;
        int month = 1;

        while (money < 70) {
            money += before;
            month++;
        }

        while (money < 100) {
            money += after;
            month++;
        }

        System.out.println(month);
    }
}
