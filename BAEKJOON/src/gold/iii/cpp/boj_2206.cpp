#include <iostream>
#include <array>
#include <queue>

using namespace std;

array<int, 4> dx{-1, 1, 0, 0};
array<int, 4> dy{0, 0, -1, 1};
array<array<array<int, 2>, 1000>, 1000> maze;

int bfs(int N, int M) {
    queue<pair<int, pair<int, int>>> q;
    q.push({0, {0, 0}});

    while (!q.empty()) {
        int broken{q.front().first};
        int x{q.front().second.first};
        int y{q.front().second.second};
        q.pop();

        if (x == N - 1 && y == M - 1)
            return maze[N - 1][M - 1][broken] + 1;

        for (int i{0}; i < 4; i++) {
            int nx{x + dx[i]};
            int ny{y + dy[i]};

            if (nx < 0 || nx >= N || ny < 0 || ny >= M)
                continue;
            if (maze[nx][ny][0] == 1) {
                if (!broken) {
                    maze[nx][ny][broken + 1] = maze[x][y][broken] + 1;
                    q.push({1, {nx, ny}});
                }
            } else if (maze[nx][ny][0] == 0) {
                if (broken == 1 && maze[nx][ny][broken])
                    continue;
                maze[nx][ny][broken] = maze[x][y][broken] + 1;
                q.push({broken, {nx, ny}});
            }
        }
    }

    return -1;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int N, M;
    cin >> N >> M;

    for (int i{0}; i < N; i++) {
        for (int j{0}; j < M; j++) {
            char tmp;
            cin >> tmp;
            maze[i][j][0] = tmp - '0';
        }
    }

    cout << bfs(N, M);

    return 0;
}