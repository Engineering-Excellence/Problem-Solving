package kr.co.programmers.lv1.java;

// 핸드폰 번호 가리기
public class mobileNum {

    private String solution(String phone_number) {

        return phone_number.replaceAll("\\d(?=\\d{4})", "*");
    }

    public static void main(String[] args) {

        mobileNum mobileNum = new mobileNum();

        System.out.println(mobileNum.solution("01033334444"));
        System.out.println(mobileNum.solution("027778888"));
    }
}
