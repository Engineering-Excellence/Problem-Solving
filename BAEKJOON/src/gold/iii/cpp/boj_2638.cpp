#include <iostream>
#include <queue>
#include <vector>

using namespace std;

int main() {
    int h, w, cheese_cnt = 0, round = 0, moves[4][2] = {{-1, 0},
                                                        {0,  1},
                                                        {1,  0},
                                                        {0,  -1}};
    cin >> h >> w;
    int count[h][w];
    bool board[h][w];
    queue<vector<int>> rm;
    queue<vector<int>> q;

    for (int i = 0; i < h; i++) {
        for (int j = 0; j < w; j++) {
            if (i == 0 || i == h - 1 || j == 0 || j == w - 1) {
                count[i][j] = 1;
                q.push({i, j});
            } else {
                count[i][j] = 0;
            }

            cin >> board[i][j];

            if (board[i][j]) {
                ++cheese_cnt;
            }
        }
    }

    while (cheese_cnt > 0) {
        while (!q.empty()) {
            vector<int> _front = q.front();
            q.pop();

            for (auto &move: moves) {
                int x = _front[0] + move[0];
                int y = _front[1] + move[1];

                if (x < 0 || x >= h || y < 0 || y >= w) continue;
                if (count[x][y] == 0) // 미방문
                {
                    if (!board[x][y]) // 공기
                    {
                        q.push({x, y});
                    }
                    count[x][y]++;
                } else // 방문
                {
                    if (board[x][y]) // 치즈
                    {
                        count[x][y]++;

                        if (count[x][y] == 2) // 두번 방문만 rm 에 저장
                        {
                            rm.push({x, y});
                        }
                    }
                }
            }
        }

        round++;
        cheese_cnt -= static_cast<int>(rm.size());
        while (!rm.empty()) {
            vector<int> _front2 = rm.front();
            q.push({_front2[0], _front2[1]});
            board[_front2[0]][_front2[1]] = false;
            count[_front2[0]][_front2[1]] = 1;
            rm.pop();
        }
    }

    cout << round;

    return 0;
}