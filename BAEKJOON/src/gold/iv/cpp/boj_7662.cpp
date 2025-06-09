#include <iostream>
#include <queue>

using namespace std;

/*
    1. 최대 힙과 최소 힙을 생성하고, pair(입력 값, 인덱스) 형태로 저장
    2. 인덱스에 대응되게 배열 생성. true면 유효 데이터, false면 삭제된 데이터
    3. 최대 힙과 최소 힙에서 데이터 값이 일치하면 당연히 인덱스도 같음
       삭제 명령 수행할 때 인덱스 저장 배열에서 false 처리
    4. 삭제 연산의 끝부분에 false 처리된 데이터가 각 힙의 top에 위치하는지 체크
       top에 위치한다면 제거, top에 더미 데이터가 없을 때까지 제거
 */
int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int t;
    cin >> t;

    while (t--) {
        priority_queue<pair<int, int>> max_pq; // 최대 힙
        priority_queue<pair<int, int>, vector<pair<int, int>>, greater<>> min_pq; // 최소 힙
        // 데이터 값, 인덱스 저장
        int k, idx = 0; // k는 명령 횟수, idx는 인덱스
        cin >> k;
        vector<bool> isValid(k); // 유효 데이터인지 체크

        while (k--) {
            char input;
            int num; // num은 데이터 값
            cin >> input >> num; // 명령, 데이터 값

            if (input == 'I') {
                max_pq.emplace(num, idx);
                min_pq.emplace(num, idx);
                isValid[idx] = true; // false가 될 경우 폐기
                idx++;
            } else {   // input == 'D'
                if (num == 1 && !max_pq.empty()) // 최대 힙
                    isValid[max_pq.top().second] = false; // 해당 값 제거 예약

                else if (num == -1 && !min_pq.empty()) // 최소 힙
                    isValid[min_pq.top().second] = false;

                // 예약된 값이 큐의 top에 있으면 제거
                while (!max_pq.empty() && !isValid[max_pq.top().second])
                    max_pq.pop();
                while (!min_pq.empty() && !isValid[min_pq.top().second])
                    min_pq.pop();
            }
        }
        if (max_pq.empty()) // min_pq.empty()
            cout << "EMPTY\n";
        else
            cout << max_pq.top().first << " " << min_pq.top().first << "\n";
    }

    return 0;
}