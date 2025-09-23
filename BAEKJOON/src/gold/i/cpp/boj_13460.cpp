#include<iostream>
#include<queue>

using namespace std;

struct step {
    int rx, ry;
    int bx, by;
    int cnt;
};

int N, M;
char map[11][11];
bool visited[11][11][11][11];
int dx[] = {1, -1, 0, 0};
int dy[] = {0, 0, 1, -1};

void move(int &rx, int &ry, int &distance, int &i) {
    while (map[rx + dx[i]][ry + dy[i]] != '#' && map[rx][ry] != 'O') {
        rx += dx[i];
        ry += dy[i];
        distance += 1;
    }
}

void bfs(int Rx, int Ry, int Bx, int By) {
    queue<step> q;
    q.push({Rx, Ry, Bx, By, 0});
    visited[Rx][Ry][Bx][By] = true;

    while (!q.empty()) {
        int rx = q.front().rx;
        int ry = q.front().ry;
        int bx = q.front().bx;
        int by = q.front().by;
        int count = q.front().cnt;
        q.pop();

        if (count >= 10) break;

        for (int i = 0; i < 4; i++) {
            int nrx = rx, nry = ry, nbx = bx, nby = by;
            int rc = 0, bc = 0, ncount = count + 1;

            move(nrx, nry, rc, i);
            move(nbx, nby, bc, i);

            if (map[nbx][nby] == 'O') continue;
            if (map[nrx][nry] == 'O') {
                cout << ncount;
                return;
            }

            if (nrx == nbx && nry == nby) {
                if (rc > bc) nrx -= dx[i], nry -= dy[i];
                else nbx -= dx[i], nby -= dy[i];
            }

            if (visited[nrx][nry][nbx][nby]) continue;
            visited[nrx][nry][nbx][nby] = true;
            q.push({nrx, nry, nbx, nby, ncount});
        }
    }

    cout << -1;
}

void solve() {
    cin >> N >> M;

    int rx = 0, ry = 0, bx = 0, by = 0;
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
            cin >> map[i][j];
            if (map[i][j] == 'R') {
                rx = i;
                ry = j;
            } else if (map[i][j] == 'B') {
                bx = i;
                by = j;
            }
        }
    }
    bfs(rx, ry, bx, by);
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    solve();

    return 0;
}