#include <iostream>

using namespace std;

long long N;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> N;
    cout << fixed << N * 78 / 100 << ' ' << N * 956 / 1000;

    return 0;
}