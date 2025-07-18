/**
 * 접시 안의 원
 *
 * @file boj_16483.cpp
 * @brief a²-b²의 값을 소수점 아래의 첫째 자리에서 반올림하여 정수로 출력
 * @author Kyle
 * @date 2025-07-18
 */

#include <iostream>
#include <cmath>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    double T;
    cin >> T;

    cout << (int) round(pow(T / 2, 2));

    return 0;
}