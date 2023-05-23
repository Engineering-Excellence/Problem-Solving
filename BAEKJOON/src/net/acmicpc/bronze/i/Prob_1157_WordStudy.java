package net.acmicpc.bronze.i;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 단어 공부
public class Prob_1157_WordStudy {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> counts = Arrays.asList(new Integer[26]);
        Collections.fill(counts, 0);
        br.readLine().toUpperCase().chars().forEach(c -> counts.set(c - 'A', counts.get(c - 'A') + 1));
        int max = Collections.max(counts);
        if (counts.indexOf(max) == counts.lastIndexOf(max)) System.out.println((char) (counts.indexOf(max) + 'A'));
        else System.out.println("?");
    }
}
