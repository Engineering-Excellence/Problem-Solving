#include <iostream>
#include <vector>

using namespace std;

int n, m, ans;
const int MAX = 504;
int tetromino[MAX][MAX];
int visited[MAX][MAX];
int dy[4] = {1, 0, -1, 0};
int dx[4] = {0, 1, 0, -1};

void dfs(int y, int x, int cnt, int val) {
    if (cnt == 4) ans = max(ans, val);
    else {
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];
            if (ny < 1 or ny > n or nx < 1 or nx > m) continue;
            if (visited[ny][nx]) continue;
            visited[ny][nx]++;
            dfs(ny, nx, cnt + 1, val + tetromino[ny][nx]);
            visited[ny][nx]--;
        }
    }
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> n >> m;

    for (int i = 1; i <= n; ++i)
        for (int j = 1; j <= m; ++j) cin >> tetromino[i][j];

    for (int i = 1; i <= n; ++i) {
        for (int j = 1; j <= m; ++j) {
            visited[i][j]++;
            dfs(i, j, 1, tetromino[i][j]);
            visited[i][j]--;
        }
    }

    for (int i = 1; i <= n; ++i) {
        for (int j = 1; j <= m; ++j) {
            int t = tetromino[i][j]; // 'T' 모양 테트로미노의 가운데를 표시
            int mini = 1001;
            for (int k = 0; k < 4; k++) {
                mini = min(mini, tetromino[i + dy[k]][j + dx[k]]); // 가운데 점의 상하좌우에 있는 값 중에 최소의 값
                t += tetromino[i + dy[k]][j + dx[k]]; // 상하좌우에 있는 값을 모두 더하여 십자가 모양 만듦
            }
            ans = max(ans, t - mini); // 상하좌우에 있는 값 중 최소 값을 제거하여 'T' 모양 테트로미노 완성
        }
    }

    cout << ans;

    return 0;
}
