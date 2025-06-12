/**
 * 16진수
 *
 * @file boj_1550.cpp
 * @brief 16진수 수를 입력받아서 10진수로 출력하는 프로그램
 * @author Kyle
 * @date 2025-06-12
 */

#include<iostream>

using namespace std;

string hexStr;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> hexStr;

    cout << stoi(hexStr, nullptr, 16);

    return 0;
}