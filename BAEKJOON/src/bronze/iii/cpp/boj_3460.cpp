/**
 * 이진수
 *
 * @file boj_3460.cpp
 * @brief 양의 정수 n을 이진수로 나타냈을 때 1의 위치를 공백으로 구분해서 위치가 낮은 것부터 줄 하나에 출력
 * @author Kyle
 * @date 2025-09-04
 */

#include <iostream>

using namespace std;

int T;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> T;
    for (int t = 0; t < T; ++t) {
        int n, digit = 0;
        cin >> n;
        while (n) {
            if (n % 2) cout << digit << ' ';
            n /= 2;
            digit++;
        }
    }

    return 0;
}