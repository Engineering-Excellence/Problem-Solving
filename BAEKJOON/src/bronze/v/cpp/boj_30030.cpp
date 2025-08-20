/**
 * 스위트콘 가격 구하기
 *
 * @file boj_30030.cpp
 * @brief 부가가치세를 제외한 가격 A를 출력
 * @author Kyle
 * @date 2025-08-20
 */

#include <iostream>

using namespace std;

int B;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> B;
    cout << B / 11 * 10;

    return 0;
}