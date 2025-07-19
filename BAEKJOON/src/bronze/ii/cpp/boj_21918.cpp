/**
 * 전구
 *
 * @file boj_21918.cpp
 * @brief 모든 명령어를 수행한 후 전구가 어떤 상태인지 출력
 * @author Kyle
 * @date 2025-07-19
 */

#include <iostream>
#include <sstream>
#include <vector>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int N, M;
    cin >> N >> M;

    string line;
    getline(cin >> ws, line);

    istringstream iss(line);
    vector<int> bulbs;
    int bulb;

    while (iss >> bulb)
        bulbs.push_back(bulb);

    for (int i{0}; i < M; ++i) {
        int a, b, c;
        cin >> a >> b >> c;

        switch (a) {
            case 1:
                bulbs[b - 1] = c;
                break;

            case 2:
                for (int r{b - 1}; r < c; ++r)
                    bulbs[r] = !bulbs[r];
                break;

            case 3:
                for (int r{b - 1}; r < c; ++r)
                    bulbs[r] = false;
                break;

            case 4:
                for (int r{b - 1}; r < c; ++r)
                    bulbs[r] = true;
                break;

            default:
                break;
        }
    }

    for (int b: bulbs)
        cout << b << ' ';

    return 0;
}