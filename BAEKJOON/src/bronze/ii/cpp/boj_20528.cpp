/**
 * 끝말잇기
 *
 * @file boj_20528.cpp
 * @brief 주어진 팰린드롬 문자열을 모두 사용했을 때 끝말잇기를 할 수 있으면 1, 그렇지 않다면 0을 출력
 * @author Kyle
 * @date 2025-06-13
 */

#include <iostream>
#include <sstream>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    char c;
    int n;
    string palindromes, token;

    cin >> n;
    getline(cin >> ws/* 입력 앞의 공백 제거 */, palindromes);
    c = palindromes[0];

    istringstream iss(palindromes); // 문자열을 스트림처럼 다루기
    while (iss >> token) {
        if (token[0] != c) {
            cout << 0;
            return 0;
        }
    }
    cout << 1;
}