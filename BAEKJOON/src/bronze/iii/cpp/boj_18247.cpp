#include <iostream>

using namespace std;

int T;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> T;
    for (int i = 0; i < T; ++i) {
        int N, M;
        cin >> N >> M;
        cout << (N >= 12 && M >= 4 ? 11 * M + 4 : -1) << '\n';
    }

    return 0;
}