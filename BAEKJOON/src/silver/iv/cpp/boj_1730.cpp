#include <iostream>

using namespace std;

int n;
string mv;
bool v[10][10]; // 수직 자취
bool h[10][10]; // 수평 자취
int row, col; // 초기 위치

/**
 * @brief 올바른 위치인지 판별하는 함수
 *
 * @param r 행
 * @param c 열
 */
bool isValidLoc(const int &r, const int &c) {
    if (r < 0 || r >= n || c < 0 || c >= n)
        return false;
    return true;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> n >> mv;

    // 각각에 경우에 대해 지나간 위치는 배열 v와 배열 h에 true 대입
    for (char m : mv) {
        if (m == 'U') {
            if (!isValidLoc(row - 1, col))
                continue;
            v[row][col] = true;
            v[--row][col] = true;
        } else if (m == 'D') {
            if (!isValidLoc(row + 1, col))
                continue;
            v[row][col] = true;
            v[++row][col] = true;
        } else if (m == 'L') {
            if (!isValidLoc(row, col - 1))
                continue;
            h[row][col] = true;
            h[row][--col] = true;
        } else {
            if (!isValidLoc(row, col + 1))
                continue;
            h[row][col] = true;
            h[row][++col] = true;
        }
    }

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (v[i][j] && h[i][j])
                cout << "+";
            else if (v[i][j])
                cout << "|";
            else if (h[i][j])
                cout << "-";
            else
                cout << ".";
        }
        cout << "\n";
    }

    return 0;
}
