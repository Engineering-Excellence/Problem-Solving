#include <iostream>
#include <queue>
#include <unordered_set>

#define X first
#define Y second

using namespace std;

int dx[] = {1, -1, 0, 0};
int dy[] = {0, 0, -1, 1};
char maps[102][102];
bool visited[102][102] = {false,};
unordered_set<char> key;    // 현재 가지고 있는 키

int h, w;
int ans = 0;    // 문서 개수

void search(int sx, int sy) {   // bfs 탐색
    queue<pair<int, int>> q;    // Bfs 큐
    queue<pair<int, int>> door[27]; // 각 알파벳 문의 큐
    visited[sx][sy] = true;
    q.emplace(sx, sy);

    while (!q.empty()) {
        int x = q.front().X;
        int y = q.front().Y;
        q.pop();

        if (maps[x][y] == '$') ans++;   // 현재 있는 곳이 $ 이면 정답 개수 +1

        for (int i = 0; i < 4; i++) {   // 상하좌우 움직임
            int nx = x + dx[i];
            int ny = y + dy[i];
            char ch = maps[nx][ny]; // 다음 위치의 단어

            if (nx < 0 || ny < 0 || nx > h + 1 || ny > w + 1 || visited[nx][ny] || ch == '*')   // 이미 방문했거나, 벽이거나, 범위 밖으로 벗어나면 안됨
                continue;
            visited[nx][ny] = true;

            if ('A' <= ch && ch <= 'Z') {   // 다음 위치가 문이라면
                if (key.count(ch + 32) == 0) door[ch - 'A'].emplace(nx, ny);    // 현재 해당 문의 키를 가지고 있지 않으면 해당 문의 큐에 넣음
                else q.emplace(nx, ny); // 해당 문의 키를 가지고 있으면 bfs 큐에 넣음
            } else if ('a' <= ch && ch <= 'z') {  // 다음 위치가 열쇠
                key.insert(ch); // 열쇠 개수 추가
                int idx = ch - 'a'; // 해당 열쇠에 대응하는 문의 알파벳 인덱스
                while (!door[idx].empty()) {    // 해당 문의 큐 안에 있는걸 전부 bfs 큐로 옮김
                    q.push(door[idx].front());
                    door[idx].pop();
                }
                q.emplace(nx, ny); // 열쇠 칸으로 이동한 것을 큐에 넣음
            } else q.emplace(nx, ny); // 다음 위치가 . 또는 $ 일때
        }
    }
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int T;
    cin >> T;

    while (T--) {
        ans = 0;
        fill(&maps[0][0], &maps[100][101], ' ');
        fill(&visited[0][0], &visited[100][101], false);
        key.clear();
        vector<pair<int, int>> start;
        cin >> h >> w;

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                cin >> maps[i][j];
                if (((i == 1 || i == h) && (1 <= j && j <= w))
                    || ((1 <= i && i <= h) && (j == 1 || j == w))) {
                    if ('a' <= maps[i][j] && maps[i][j] <= 'z') {
                        key.insert(maps[i][j]);
                        start.emplace_back(i, j);
                    }
                    if (maps[i][j] == '.' || maps[i][j] == '$') start.emplace_back(i, j);
                }
            }
        }

        string has;
        cin >> has;
        for (auto it: has) key.insert(it);
        search(0, 0);

        cout << ans << "\n";
    }
}