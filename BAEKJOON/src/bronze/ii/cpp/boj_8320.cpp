#include <iostream>

using namespace std;

int n;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int r = 0;
    cin >> n;

    for (int i = 1; i <= n; i++) {
        if (n / i < i) continue;
        r += n / i - i + 1;
    }

    cout << r;

    return 0;
}