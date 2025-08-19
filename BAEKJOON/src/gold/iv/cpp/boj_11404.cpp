#include <iostream>
#include <vector>

using namespace std;

int n, m;
long long INF = 1LL << 60;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> n >> m;
    vector<vector<long long>> board(n, vector<long long>(n, INF));

    for (int i = 0; i < m; i++) {
        int src, dest, cost;
        cin >> src >> dest >> cost;
        if (board[src - 1][dest - 1] > cost) {
            board[src - 1][dest - 1] = cost;
        }
    }

    for (int i = 0; i < n; i++) {
        board[i][i] = 0;
    }

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                board[j][k] = min(board[j][i] + board[i][k], board[j][k]);
            }
        }
    }

    for (const auto &row: board) {
        for (auto num: row) {
            cout << (num == INF ? 0 : num) << ' ';
        }
        cout << '\n';
    }

    return 0;
}