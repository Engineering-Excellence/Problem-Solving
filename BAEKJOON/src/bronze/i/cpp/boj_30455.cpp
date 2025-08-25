/**
 * 이제는 더 이상 물러날 곳이 없다
 *
 * @file boj_30455.cpp
 * @brief 건덕이가 이길 경우 Duck을, 건구스가 이길 경우 Goose를 출력
 * @author Kyle
 * @date 2025-08-25
 */

#include <iostream>

using namespace std;

int N;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> N;
    cout << (N % 2 ? "Goose" : "Duck");

    return 0;
}