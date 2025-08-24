#include <iostream>

using namespace std;

int N, ans = 0;

void dfs(int row, int cols, int diag1, int diag2) {
    if (row == N) {
        ++ans;
        return;
    }

    int avail = ~(cols | diag1 | diag2) & ((1 << N) - 1);

    while (avail) {
        int pick = avail & -avail;
        avail -= pick;
        dfs(row + 1,
            cols | pick,
            (diag1 | pick) << 1,
            (diag2 | pick) >> 1);
    }
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> N;

    dfs(0, 0, 0, 0);

    cout << ans;

    return 0;
}