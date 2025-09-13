/**
 * Since 1973
 *
 * @file boj_28135.cpp
 * @brief 선우의 방식대로 1부터 차례대로 수를 셌을 때 어떤 수 N이 몇 번째 수에서 처음 등장하는지 출력
 * @author Kyle
 * @date 2025-09-13
 */

#include <iostream>

using namespace std;

int N, cnt{0};

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> N;

    for (int i{1}; i < N; ++i)
        cnt += to_string(i).find("50") == string::npos ? 1 : 2;

    cout << cnt + 1;

    return 0;
}