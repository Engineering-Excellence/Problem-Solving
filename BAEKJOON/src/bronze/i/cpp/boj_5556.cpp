#include <iostream>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int n, q;
    cin >> n >> q;
    while (q--) {
        int x, y;
        cin >> x >> y;
        cout << (min(min(x, n - x + 1), min(y, n - y + 1)) - 1) % 3 + 1 << '\n';
    }

    return 0;
}