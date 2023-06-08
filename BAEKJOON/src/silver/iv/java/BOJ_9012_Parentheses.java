package silver.iv.java;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

// 괄호
public class BOJ_9012_Parentheses {

    private static boolean isVPS(String ps) {

        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < ps.length(); i++) {
            char c = ps.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        final int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            bw.write(isVPS(br.readLine()) ? "YES" : "NO");
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
