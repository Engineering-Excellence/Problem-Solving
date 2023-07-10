package lv1.java;

// 시저 암호
public class CaesarCipher {

    public String solution(String s, int n) {

        /*char[] charArr = s.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] != ' ') {
                if (charArr[i] >= 'A' && charArr[i] <= 'Z') {
                    if (charArr[i] + n > 'Z') {
                        charArr[i] += n - 26;
                    } else {
                        charArr[i] += n;
                    }
                } else if (charArr[i] >= 'a' && charArr[i] <= 'z') {
                    if (charArr[i] + n > 'z') {
                        charArr[i] += n - 26;
                    } else {
                        charArr[i] += n;
                    }
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : charArr) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();*/

        return s.chars().map(c -> {
                    if (Character.isLowerCase(c)) {
                        return 'a' + (c - 'a' + n) % 26;
                    } else if (Character.isUpperCase(c)) {
                        return 'A' + (c - 'A' + n) % 26;
                    } else {
                        return c;
                    }
                }).mapToObj(c -> String.valueOf((char) c))
                .reduce((c1, c2) -> c1 + c2).orElse("");
    }

    public static void main(String[] args) {

        CaesarCipher caesarCipher = new CaesarCipher();

        System.out.println(caesarCipher.solution("AB", 1));
        System.out.println(caesarCipher.solution("z", 1));
        System.out.println(caesarCipher.solution("a B z", 4));
    }
}