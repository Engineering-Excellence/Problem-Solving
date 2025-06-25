/**
 * 홍익대학교
 *
 * @file boj_16394.cpp
 * @brief 특정 년도가 주어졌을 때, 그 해가 개교 몇 주년인지 출력
 * @author Kyle
 * @date 2025-06-25
 */

#include <iostream>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int n;

    cin >> n;
    cout << n - 1946;

    return 0;
}
