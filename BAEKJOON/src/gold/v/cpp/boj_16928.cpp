#include <iostream>
#include <queue>

using namespace std;

int board[102] = {0};
bool visited[102] = {false};

void game(int x, int c) {
    queue<pair<int, int>> q;
    q.emplace(x, c);

    while (!q.empty()) {
        int loc = q.front().first; // 현재 좌표
        int cnt = q.front().second; // 카운트
        q.pop();

        for (int i = 1; i <= 6; i++) {
            int nx = loc + i; // 다음 좌표
            if (nx == 100) {
                cout << cnt + 1; // 도착했으면 출력
                return;
            } else if (nx < 100) { // 100보다 작은 좌표일 경우
                while (board[nx] != 0) { // 사다리 또는 뱀인지 확인
                    nx = board[nx]; // 점프한 자리로 이동
                }
                if (!visited[nx]) { // 처음 방문한 좌표일 경우
                    q.emplace(nx, cnt + 1);
                    visited[nx] = true; // 방문 처리
                }
            }
        }
    }
}

int main() {
    int n, m, x, y;

    cin >> n >> m;
    for (int i = 0; i < n; i++) {
        cin >> x >> y;
        board[x] = y; // 사다리 저장
    }
    for (int i = 0; i < m; i++) {
        cin >> x >> y;
        board[x] = y; // 뱀 저장
    }
    game(1, 0);

    return 0;
}