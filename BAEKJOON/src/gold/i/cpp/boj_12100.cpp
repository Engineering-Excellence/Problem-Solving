#include <iostream>

#define MAXCOUNT 5

using namespace std;

enum {
    U, D, R, L
};

int N;
int board[20][20];
int globalMax;
int localMax;
const int dir[4] = {U, D, L, R};

void move_up() {
    for (int i = 0; i < N; i++) {
        int destination = 0;
        for (int j = 0; j < N; j++) {
            if (board[j][i] != 0) {
                for (int k = j + 1; k < N; k++) {
                    if (board[k][i] != 0) {
                        if (board[k][i] == board[j][i]) {
                            board[k][i] = 0;
                            board[j][i] *= 2;
                        }
                        break;
                    }
                }
                board[destination][i] = board[j][i];
                if (destination != j)
                    board[j][i] = 0;
                if (board[destination][i] > localMax)
                    localMax = board[destination][i];
                destination++;
            }
        }
    }
}

void move_down() {
    for (int i = 0; i < N; i++) {
        int destination = N - 1;
        for (int j = N - 1; j >= 0; j--) {
            if (board[j][i] != 0) {
                for (int k = j - 1; k >= 0; k--) {
                    if (board[k][i] != 0) {
                        if (board[k][i] == board[j][i]) {
                            board[k][i] = 0;
                            board[j][i] *= 2;
                        }
                        break;
                    }
                }
                board[destination][i] = board[j][i];
                if (destination != j)
                    board[j][i] = 0;
                if (board[destination][i] > localMax)
                    localMax = board[destination][i];
                destination--;
            }
        }
    }
}

void move_left() {
    for (int i = 0; i < N; i++) {
        int destination = 0;
        for (int j = 0; j < N; j++) {
            if (board[i][j] != 0) {
                for (int k = j + 1; k < N; k++) {
                    if (board[i][k] != 0) {
                        if (board[i][k] == board[i][j]) {
                            board[i][k] = 0;
                            board[i][j] *= 2;
                        }
                        break;
                    }
                }
                board[i][destination] = board[i][j];
                if (destination != j)
                    board[i][j] = 0;
                if (board[i][destination] > localMax)
                    localMax = board[i][destination];
                destination++;
            }
        }
    }
}

void move_right() {
    for (int i = 0; i < N; i++) {
        int destination = N - 1;
        for (int j = N - 1; j >= 0; j--) {
            if (board[i][j] != 0) {
                for (int k = j - 1; k >= 0; k--) {
                    if (board[i][k] != 0) {
                        if (board[i][k] == board[i][j]) {
                            board[i][k] = 0;
                            board[i][j] *= 2;
                        }
                        break;
                    }
                }
                board[i][destination] = board[i][j];
                if (destination != j)
                    board[i][j] = 0;
                if (board[i][destination] > localMax)
                    localMax = board[i][destination];
                destination--;
            }
        }
    }
}

int bruteForce(int direction, int depth) {
    int backup[20][20];
    for (int i = 0; i < N; i++)
        for (int j = 0; j < N; j++)
            backup[i][j] = board[i][j];
    switch (direction) {
        case U:
            localMax = 0;
            move_up();
            break;
        case D:
            localMax = 0;
            move_down();
            break;
        case L:
            localMax = 0;
            move_left();
            break;
        case R:
            localMax = 0;
            move_right();
            break;
        default:
            break;
    }

    int ret;
    if (depth == MAXCOUNT)
        ret = localMax;
    else {
        if (globalMax >= (1 << (MAXCOUNT - depth)) * localMax)
            ret = 0;
        else {
            ret = globalMax;
            for (int i: dir)
                ret = max(ret, bruteForce(i, depth + 1));
            if (ret > globalMax)
                globalMax = ret;
        }
    }

    for (int i = 0; i < N; i++)
        for (int j = 0; j < N; j++)
            board[i][j] = backup[i][j];

    return ret;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> N;

    for (int i = 0; i < N; i++)
        for (int j = 0; j < N; j++) {
            cin >> board[i][j];
            if (board[i][j] > localMax)
                localMax = board[i][j];
        }

    bruteForce(-1, 0);

    cout << globalMax;

    return 0;
}