package bronze.iii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 알람 시계
public class BOJ_2884_AlarmClock {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder ans = new StringBuilder();
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken()) - 45;
        if (minute < 0) {
            minute += 60;
            hour--;
            if (hour < 0) {
                hour += 24;
            }
        }
        ans.append(hour).append(" ").append(minute);
        System.out.print(ans);
    }
}
