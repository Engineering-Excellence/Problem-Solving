package net.acmicpc.silver.IV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

// 큐
public class Prob_10845_Queue {

    static int front = 0;
    static int rear = -1;
    static List<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int num = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String method = st.nextToken();
            if (st.hasMoreTokens()) num = Integer.parseInt(st.nextToken());
            switch (method) {
                case "push": push(num); break;
                case "pop": sb.append(pop()).append("\n"); break;
                case "size": sb.append(size()).append("\n"); break;
                case "empty": sb.append(empty()).append("\n"); break;
                case "front": sb.append(front()).append("\n"); break;
                case "back": sb.append(back()).append("\n"); break;
                default: break;
            }
        }
        System.out.print(sb);
    }

    static void push(int num) {
        queue.add(num);
        rear++;
    }

    static int pop() {
        int res = -1;
        if (front <= rear) {
            res = queue.get(front);
            front++;
        }
        return res;
    }

    static int size() {
        return rear - front + 1;
    }

    static int empty() {
        return front > rear ? 1 : 0;
    }

    static int front() {
        return front <= rear ? queue.get(front) : -1;
    }

    static int back() {
        return front <= rear ? queue.get(rear) : -1;
    }
}
