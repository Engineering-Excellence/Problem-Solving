package kr.co.programmers.lv1;

// 정수 내림차순으로 배치하기
public class IntDesc {

    String res = "";

    private long solution(long n) {
        /*char[] arr = Long.toString(n).toCharArray();
        Arrays.sort(arr);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            stringBuilder.append(arr[i]);
        }
        return Long.parseLong(stringBuilder.toString());*/

        Long.toString(n).chars().sorted().forEach(c -> res = (char) c + res);
        return Long.parseLong(res);
    }

    public static void main(String[] args) {

        IntDesc intDesc = new IntDesc();

        System.out.print((intDesc.solution(118372)));
    }
}
