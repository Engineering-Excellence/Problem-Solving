/**
 * 팰린드롬
 *
 * @file boj_13235.cpp
 * @brief 입력으로 주어진 단어가 팰린드롬이면 "true", 아니면 "false"를 출력
 * @author Kyle
 * @date 2025-09-05
 */

#include <iostream>

using namespace std;

string str;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> str;
    string rStr = str;
    reverse(rStr.begin(), rStr.end());

    cout << (str == rStr ? "true" : "false");

    return 0;
}