package silver.iv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 카드2
public class BOJ_2164_Card2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

//        Queue<Integer> queue = new LinkedList<>(IntStream.iterate(1, i -> i + 1).limit(N).boxed().toList());  // JDK 16↑
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        while (queue.size() > 1) {
            queue.remove();
            queue.offer(queue.remove());
        }
        System.out.print(queue.peek());
    }
}
