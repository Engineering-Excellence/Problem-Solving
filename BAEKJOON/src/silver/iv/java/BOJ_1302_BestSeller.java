package silver.iv.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// 베스트셀러
public class BOJ_1302_BestSeller {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        Map<String, Integer> bookList = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String title = br.readLine();
            bookList.put(title, bookList.getOrDefault(title, 0) + 1);
        }

        System.out.println(findBestSeller(bookList));
    }

    private static String findBestSeller(Map<String, Integer> bookList) {

        int maxCount = 0;
        String bestSeller = "";

        for (Map.Entry<String, Integer> entry : bookList.entrySet()) {
            String title = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount || (count == maxCount && title.compareTo(bestSeller) < 0)) {
                maxCount = count;
                bestSeller = title;
            }
        }

        return bestSeller;
    }
}
