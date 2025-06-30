/**
 * 마라토너
 *
 * @file boj_9339.cpp
 * @brief 가장 기록이 좋은 수강생의 번호와 인증서를 받은 수강생의 수를 출력
 * @author Kyle
 * @date 2025-06-30
 */

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int T, K, N;

    cin >> T;
    for (int t = 1; t <= T; ++t)
    {
        cin >> K;
        vector<int> students(K);
        for (int k = 0; k < K; ++k)
            cin >> students[k]; // 수강생 리스트 입력

        cin >> N;
        int num, hour, min;
        int cert = 0;
        array<int, 2> mvp = {-1, 361}; // 가장 빠른 수강생 번호와 기록
        for (int n = 0; n < N; ++n)
        {
            cin >> num >> hour >> min;
            const int rec = 60 * hour + min; // 기록을 분으로 환산
            if (hour < 0 || min < 0 || rec > 360) continue; // 중도 포기자 또는 6시간 초과자 제외
            if (find(students.begin(), students.end(), num) != students.end()) // 수강생 여부 확인
            {
                ++cert; // 인증서를 받은 수강생 수 증가
                if (rec < mvp[1]) // 기록이 더 짧으면 가장 빠른 수강생 정보 갱신
                {
                    mvp[0] = num;
                    mvp[1] = rec;
                }
            }
        }

        cout << mvp[0] << " " << cert << '\n';
    }

    return 0;
}
