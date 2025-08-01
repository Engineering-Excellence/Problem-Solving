/**
 * 헤라클레스와 히드라
 *
 * @file boj_10205.cpp
 * @brief 헤라클레스와 이올라우스의 행동이 끝난 후 남아있는 히드라의 머리 개수를 출력
 * @author Kyle
 * @date 2025-08-02
 */

#include <iostream>

using namespace std;

int K;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> K;

    for (int i = 0; i < K; ++i) {
        int h;
        string dataSet;
        cin >> h >> dataSet;

        for (char behavior: dataSet) {
            if (behavior == 'c') ++h;
            else if (behavior == 'b') --h;
        }

        cout << "Data Set " << i + 1 << ":\n" << h << "\n\n";
    }

    return 0;
}