package kr.co.programmers.lv1;

import java.util.Arrays;
import java.util.stream.LongStream;

// x만큼 간격이 있는 n개의 숫자
public class DistantNum {

    private long[] solution(int x, int n) {

//        return LongStream.range(0, n).map(i -> (i + 1) * x).toArray();
        return LongStream.iterate(x, i -> i + x).limit(n).toArray();
    }

    public static void main(String[] args) {

        DistantNum distantNum = new DistantNum();
        System.out.println(Arrays.toString(distantNum.solution(2, 5)));
        System.out.println(Arrays.toString(distantNum.solution(4, 3)));
        System.out.println(Arrays.toString(distantNum.solution(-4, 2)));
    }
}
