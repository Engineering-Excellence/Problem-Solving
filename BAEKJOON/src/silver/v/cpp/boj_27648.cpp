#include <iostream>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int n, m, k;
    cin >> n >> m >> k;

    if (n + m - 1 > k) {
        cout << "NO";
    } else {
        int count = 1;
        cout << "YES\n";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                cout << count++ << " ";
            count = i + 2;
            cout << "\n";
        }
    }

    return 0;
}