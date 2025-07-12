/**
 * 뒤집힌 덧셈
 *
 * @file boj_1357.cpp
 * @brief Rev(X)를 X의 모든 자리수를 역순으로 만드는 함수라고 할 때, Rev(Rev(X) + Rev(Y))를 출력
 * @author Kyle
 * @date 2025-07-12
 */

#include <iostream>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    string X, Y;
    cin >> X >> Y;

    reverse(X.begin(), X.end());
    reverse(Y.begin(), Y.end());

    string strSum = to_string(stoi(X) + stoi(Y));
    reverse(strSum.begin(), strSum.end());

    cout << stoi(strSum);

    return 0;
}