package silver.iv.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

// 덱
class Deque {

    private final List<Integer> deque;
    private int front;
    private int rear;

    Deque() {
        deque = new LinkedList<>();
        front = 0;
        rear = -1;
    }

    void offerFirst(int n) {
        deque.add(front, n);
        rear++;
    }

    void offerLast(int n) {
        deque.add(n);
        rear++;
    }

    int pollFirst() {
        return front <= rear ? deque.get(front++) : -1;
    }

    int pollLast() {
        return front <= rear ? deque.remove(rear--) : -1;
    }

    int size() {
        return rear - front + 1;
    }

    int isEmpty() {
        return front > rear ? 1 : 0;
    }

    int peekFirst() {
        return front <= rear ? deque.get(front) : -1;
    }

    int peekLast() {
        return front <= rear ? deque.get(rear) : -1;
    }
}

public class BOJ_10866_Deque {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        Deque deque = new Deque();
        final int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer command = new StringTokenizer(br.readLine());
            switch (command.nextToken()) {
                case "push_front" -> deque.offerFirst(Integer.parseInt(command.nextToken()));
                case "push_back" -> deque.offerLast(Integer.parseInt(command.nextToken()));
                case "pop_front" -> ans.append(deque.pollFirst()).append("\n");
                case "pop_back" -> ans.append(deque.pollLast()).append("\n");
                case "size" -> ans.append(deque.size()).append("\n");
                case "empty" -> ans.append(deque.isEmpty()).append("\n");
                case "front" -> ans.append(deque.peekFirst()).append("\n");
                case "back" -> ans.append(deque.peekLast()).append("\n");
            }
        }
        System.out.print(ans);
    }
}
