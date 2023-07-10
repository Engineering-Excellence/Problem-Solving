package lv1.java;

import java.util.Arrays;

// 자연수 뒤집어 배열로 만들기
public class ReverseNumArr {

    private int[] solution(long n) {

        /*
            int[] answer = new int[(int) Math.log10(n) + 1];
            int i = 0;
            while (n >= 1) {
                answer[i] = (int) (n % 10);
                n /= 10;
                i++;
            }
            return answer;
        */

        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }

    public static void main(String[] args) {

        ReverseNumArr reverseNumArr = new ReverseNumArr();

        System.out.println(Arrays.toString(reverseNumArr.solution(12345)));
    }
}
