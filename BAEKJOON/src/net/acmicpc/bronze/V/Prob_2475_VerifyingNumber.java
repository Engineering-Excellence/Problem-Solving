package net.acmicpc.bronze.V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 검증수
public class Prob_2475_VerifyingNumber {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int sum = 0;
    for (int i = 0; i < 5; i++) {
      sum += Math.pow(Integer.parseInt(st.nextToken()), 2);
    }
    System.out.print(sum % 10);
  }
}
