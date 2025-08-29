/**
 * 그릇
 *
 * @file boj_7567.cpp
 * @brief 그릇의 최종의 높이를 정수로 출력
 * @author Kyle
 * @date 2025-08-29
 */

#include <iostream>

using namespace std;

string bowl;
int height = 10;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> bowl;

    for (int i = 1; i < bowl.length(); ++i)
        height += (bowl[i] == bowl[i - 1] ? 5 : 10);

    cout << height;

    return 0;
}