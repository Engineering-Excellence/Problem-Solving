/* C++17 버전에서 올바르게 동작 */

#include <bits/stdc++.h>

using namespace std;

const int max_n = 100;

struct Shark {
    int y, x, s, dir, z, dead;
} a[max_n * max_n];
const int dx[] = {0, 0, 1, -1};
const int dy[] = {-1, 1, 0, 0};
int shark[max_n][max_n], R, C, M, ret, temp[max_n][max_n]; // temp는 상어들의 위치가 중복되는 경우를 계산하기 위함이다.

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> R >> C >> M;

    for (int i = 1; i <= M; i++) {
        // shark 배열에 상어의 위치를 인덱스로 나타낸다.
        cin >> a[i].y >> a[i].x >> a[i].s >> a[i].dir >> a[i].z;
        a[i].y--;
        a[i].x--;
        a[i].dir--;

        // 벽을 한번 왕복하는 기준으로 모듈러 연산을 진행한다.
        if (a[i].dir <= 1) {
            // 방향이 위 아래로 움직이는 경우
            a[i].s %= 2 * (R - 1);
        } else {
            // 방향이 좌우로 움직이는 경우 dir == 2, dir ==3
            a[i].s %= 2 * (C - 1);
        }
        shark[a[i].y][a[i].x] = i;
    }

    // 낚시꾼이 시뮬레이션
    for (int x = 0; x < C; x++) {
        for (int y = 0; y < R; y++) {
            if (shark[y][x]) {
                // 이 조건문 때문에 상어의 인덱스를 1부터 시작함
                a[shark[y][x]].dead = 1; // 상어 죽음 처리
                ret += a[shark[y][x]].z;
                shark[y][x] = 0;
                break;
            }
        }
        memset(temp, 0, sizeof(temp)); // 배열 전체 초기화할떄 사용
        for (int i = 1; i <= M; i++) {
            if (a[i].dead) continue;

            int iy = a[i].y;
            int ix = a[i].x;
            int s = a[i].s;
            int d = a[i].dir;
            int ny, nx;

            while (1) {
                ny = iy + s * dy[d];
                nx = ix + s * dx[d];
                if (nx < C && ny < R && ny >= 0 && nx >= 0) break;
                if (d <= 1) {
                    if (ny < 0) {
                        s -= iy;
                        iy = 0;
                    } else {
                        s -= R - 1 - iy;
                        iy = R - 1;
                    }
                } else {
                    if (nx < 0) {
                        s -= ix;
                        ix = 0;
                    } else {
                        s -= C - 1 - ix;
                        ix = C - 1;
                    }
                }
                d ^= 1; // 한번 부딪힌 경우이므로 방향전환 해준다.
            }

            if (temp[ny][nx]) {
                // 상어가 같은 자리에 여러마리 몰린 경우 가장 큰놈만 살려둔다.
                if (a[temp[ny][nx]].z < a[i].z) {
                    a[temp[ny][nx]].dead = 1;
                    temp[ny][nx] = i;
                } else {
                    a[i].dead = 1;
                }
            } else {
                temp[ny][nx] = i;
            }

            a[i].y = ny;
            a[i].x = nx;
            a[i].dir = d;
        }
        memcpy(shark, temp, sizeof(temp));
    }

    cout << ret;

    return 0;
}