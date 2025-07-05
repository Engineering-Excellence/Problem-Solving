/**
 * 나는 친구가 적다 (Large)
 *
 * @file boj_16172.cpp
 * @brief 성민이가 찾고자 하는 키워드가 교과서 내에 존재하면 1, 존재하지 않으면 0을 출력
 * @author Kyle
 * @date 2025-07-05
 */

#include <iostream>
#include <string>
#include <cctype>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    string S, K;
    cin >> S >> K;

    S.erase(remove_if(S.begin(), S.end(), ::isdigit), S.end()); // 숫자 제거
    cout << (S.find(K) != string::npos);

    return 0;
}