/**
 * 수학은 비대면강의입니다
 *
 * @file boj_19532.cpp
 * @brief 문제의 답인 x와 y를 공백으로 구분해 출력
 * @author Kyle
 * @date 2025-08-22
 */

#include <iostream>

using namespace std;

int a, b, c, d, e, f;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> a >> b >> c >> d >> e >> f;

    int det = a * e - b * d;
    int detx = c * e - b * f;
    int dety = a * f - c * d;

    int x = detx / det;
    int y = dety / det;

    cout << x << ' ' << y;

    return 0;
}