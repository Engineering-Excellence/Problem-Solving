#include <iostream>
#include <queue>

using namespace std;

int R, C;
char board[20][20];
bool visited[26]{false,};

int ans{0};
int dx[4]{0, 0, 1, -1};
int dy[4]{1, -1, 0, 0};

void solve(int x, int y, int moved) {
    ans = max(ans, moved);

    for (int i{0}; i < 4; ++i) {
        int nx{x + dx[i]};
        int ny{y + dy[i]};

        if (nx >= 0 && ny >= 0 && nx < C && ny < R) {
            int idx{board[ny][nx] - 'A'};
            if (!visited[idx]) {
                visited[idx] = true;
                solve(nx, ny, moved + 1);
                visited[idx] = false;
            }
        }
    }
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> R >> C;

    for (int y{0}; y < R; ++y) {
        for (int x{0}; x < C; ++x) {
            cin >> board[y][x];
        }
    }

    visited[board[0][0] - 'A'] = true;
    solve(0, 0, 1);

    cout << ans;

    return 0;
}