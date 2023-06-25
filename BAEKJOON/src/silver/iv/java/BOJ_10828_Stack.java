package silver.iv.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 스택
class Stack {

    private int top;
    private final ArrayList<Integer> stack;

    public Stack() {
        this.stack = new ArrayList<>();
        this.top = -1;
    }

    public void push(int x) {
        stack.add(x);
        top++;
    }

    public int pop() {
        return top >= 0 ? stack.remove(top--) : -1;
    }

    public int size() {
        return top + 1;
    }

    public int empty() {
        return top == -1 ? 1 : 0;
    }

    public int top() {
        return top >= 0 ? stack.get(top) : -1;
    }
}

public class BOJ_10828_Stack {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        StringBuilder ans = new StringBuilder();
        Stack stack = new Stack();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            /*
                switch (cmd) {
                    case "push":
                        stack.push(Integer.parseInt(st.nextToken()));
                        break;
                    case "pop":
                        ans.append(stack.pop()).append('\n');
                        break;
                    case "size":
                        ans.append(stack.size()).append('\n');
                        break;
                    case "empty":
                        ans.append(stack.empty()).append('\n');
                        break;
                    case "top":
                        ans.append(stack.top()).append('\n');
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + cmd);
                }
             */
            switch (cmd) {
                case "push" -> stack.push(Integer.parseInt(st.nextToken()));
                case "pop" -> ans.append(stack.pop()).append('\n');
                case "size" -> ans.append(stack.size()).append('\n');
                case "empty" -> ans.append(stack.empty()).append('\n');
                case "top" -> ans.append(stack.top()).append('\n');
                default -> throw new IllegalStateException("Unexpected value: " + cmd);
            }
        }
        System.out.print(ans);
    }
}
