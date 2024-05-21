package lv0.pcce.java;

import java.util.Scanner;

/**
 * <h1>[PCCE 기출문제] 3번 / 나이 계산</h1>
 *
 * @author Kyle
 * @since 2024.05.22.
 */
public class PCCE_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String age_type = sc.next();
        int answer = 0;

        if (age_type.equals("Korea")) {
            answer = 2030 - year + 1;
        } else if (age_type.equals("Year")) {
            answer = 2030 - year;
        }

        System.out.println(answer);
    }
}
