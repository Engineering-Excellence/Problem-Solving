package silver.v;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ChoiceFormat;
import java.text.ParseException;
import java.util.StringTokenizer;

// 너의 평점은
public class BOJ_25206_YourGPA {

    public static void main(String[] args) throws IOException, ParseException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final double[] limits = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};
        final String[] formats = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        final ChoiceFormat format = new ChoiceFormat(limits, formats);
        double denom = 0.0;
        double numer = 0.0;

        for (int subject = 0; subject < 20; subject++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken(); // 과목명 제거
            double point = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            if (!grade.equals("P")) {
                denom += point * format.parse(grade).doubleValue();
                numer += point;
            }
        }
        System.out.println(denom / numer);
    }
}
