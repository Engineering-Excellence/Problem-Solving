#include <iostream>

using namespace std;

int N, ans = 0;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> N;

    for (int i = 2; i < N - 1; i += 2)
        ans += (N - i - 2) / 2;

    cout << ans;

    return 0;
}