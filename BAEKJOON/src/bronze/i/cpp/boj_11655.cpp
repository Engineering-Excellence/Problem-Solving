/**
 * ROT13
 *
 * @file boj_11655.cpp
 * @brief ROT13으로 암호화한 내용을 출력
 * @author Kyle
 * @date 2025-07-06
 */

#include <iostream>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    string S;
    getline(cin, S);

    for (char &c: S) {
        if ('A' <= c && c <= 'Z')
            c = static_cast<char>((c - 'A' + 13) % 26 + 'A');
        else if ('a' <= c && c <= 'z')
            c = static_cast<char>((c - 'a' + 13) % 26 + 'a');
    }

    cout << S << endl;

    return 0;
}