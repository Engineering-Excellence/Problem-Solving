package silver.iv.java;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

// 균형 잡힌 세상
public class BOJ_4949_BalancedWorld {

    private static boolean isBalanced(String sentence) {

        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c == '(' || c == '[') {
                stack.offerLast(c);
            } else if (c == ')' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char pair = c == ')' ? '(' : '[';
                    if (stack.peekLast() != pair)
                        return false;
                }
                stack.pollLast();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();
            if (input.equals(".")) break;
            bw.write(isBalanced(input) ? "yes" : "no");
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
