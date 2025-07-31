/**
 * 택시 기하학
 *
 * @file boj_3053.cpp
 * @brief 유클리드 기하학에서 반지름이 R인 원의 넓이와 택시 기하학에서 반지름이 R인 원의 넓이를 출력
 * @author Kyle
 * @date 2025-07-31
 */

#include <iostream>
#include <cmath>
#include <iomanip>

using namespace std;

long double R;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> R;
    cout << fixed << setprecision(6);   // 소수점 이하 6자리까지 고정 소수점 형식으로 출력
    cout << M_PIl * pow(R, 2) << '\n' << 2 * R * R;

    return 0;
}