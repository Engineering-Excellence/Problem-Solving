#include <iostream>

using namespace std;

int K;
string S;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> K >> S;

    for (int i = 0; i < S.length(); i += K) {
        cout << S[i];
    }

    return 0;
}