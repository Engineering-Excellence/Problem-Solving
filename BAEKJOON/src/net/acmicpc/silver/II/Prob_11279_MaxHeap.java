package net.acmicpc.silver.II;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 최대 힙
public class Prob_11279_MaxHeap {

    static int[] heap;
    static int size = 0;

    static void swap(int a, int b) {
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    static void offer(int n) {
        heap[++size] = n;
        int i = size;
        // 부모 노드보다 자식 노드가 크면 서로 교환
        while (i > 1 && heap[i / 2] < heap[i]) {
            swap(i / 2, i);
            i /= 2;
        }
    }

    static int poll() {
        if (size < 1) return 0;
        else {
            int max = heap[1];
            heap[1] = heap[size];
            heap[size--] = 0;
            int i = 1;
            // 부모 노드보다 자식 노드가 크면 서로 교환
            while (2 * i <= size && (heap[i] < heap[2 * i] || heap[i] < heap[2 * i + 1])) {
                if (heap[2 * i] > heap[2 * i + 1]) {  // 왼쪽 노드가 큰 경우
                    swap(i, 2 * i);
                    i *= 2;
                } else {    // 오른쪽 노드가 큰 경우
                    swap(i, 2 * i + 1);
                    i = 2 * i + 1;
                }
            }
            return max;
        }
    }

    public static void main(String[] args) throws IOException {

//        System.setIn(new FileInputStream("BAEKJOON/sample_input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        heap = new int[N + 1];
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) ans.append(poll()).append("\n");
            else offer(n);
        }
        System.out.print(ans);
    }
}
