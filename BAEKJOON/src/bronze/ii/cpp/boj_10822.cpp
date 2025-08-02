/**
 * 더하기
 *
 * @file boj_10822.cpp
 * @brief 문자열 S에 포함되어 있는 자연수의 합을 출력
 * @author Kyle
 * @date 2025-08-03
 */

#include <iostream>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int sum = 0;
    string token;

    while (getline(cin, token, ','))
        sum += stoi(token);

    cout << sum;

    return 0;
}