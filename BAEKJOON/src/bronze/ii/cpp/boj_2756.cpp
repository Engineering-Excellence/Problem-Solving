/**
 * 다트
 *
 * @file boj_2756.cpp
 * @brief 다트 게임의 점수와 승부를 출력
 * @author Kyle
 * @date 2025-06-21
 */

#include <iostream>
#include <sstream>
#include <cmath>

using namespace std;

int t;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> t;

    for (int i = 0; i < t; ++i) {
        double scores[3]{0, 0, 0};
        string input, x, y;
        getline(cin >> ws, input);
        istringstream iss(input);

        for (int j = 0; j < 6; ++j) {
            iss >> x >> y;
            double r = hypot(stod(x), stod(y));
            int pt = 0;
            if (r <= 3) pt = 100;
            else if (r <= 6) pt = 80;
            else if (r <= 9) pt = 60;
            else if (r <= 12) pt = 40;
            else if (r <= 15) pt = 20;
            scores[j / 3 + 1] += pt;
        }

        cout << "SCORE: " << scores[1] << " to " << scores[2];
        if (scores[1] == scores[2])
            cout << ", TIE.\n";
        else
            cout << ", PLAYER " << (scores[1] > scores[2] ? 1 : 2) << " WINS.\n";
    }

    return 0;
}