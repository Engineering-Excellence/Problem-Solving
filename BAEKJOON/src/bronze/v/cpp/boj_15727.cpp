/**
 * 조별과제를 하려는데 조장이 사라졌다
 *
 * @file boj_15727.cpp
 * @brief 성우가 최소 t분만에 민건이를 찾을 수 있을 때, t 이상의 가장 작은 정수를 출력
 * @author Kyle
 * @date 2025-09-03
 */

#include <iostream>
#include <cmath>

using namespace std;

int L;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> L;
    cout << ceil(static_cast<double>(L) / 5);

    return 0;
}