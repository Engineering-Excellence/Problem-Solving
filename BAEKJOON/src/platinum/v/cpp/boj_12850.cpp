#include<iostream>
#include<vector>

using namespace std;

const int MOD = 1e9 + 7;
pair<int, int> route[12] = {{0, 1},
                            {0, 2},
                            {1, 2},
                            {1, 3},
                            {2, 3},
                            {2, 5},
                            {3, 4},
                            {3, 5},
                            {4, 5},
                            {4, 6},
                            {5, 7},
                            {6, 7}};
int d;
vector<vector<vector<long long>>> pos(32, vector<vector<long long>>(8, vector<long long>(8)));
vector<vector<long long>> ansvec(8, vector<long long>(8));
long long ans = 0;

vector<vector<long long>> matrix(vector<vector<long long>> a, vector<vector<long long>> b) {
    vector<vector<long long>> res(8, vector<long long>(8));

    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            long long tmp = 0;
            for (int k = 0; k < 8; k++) {
                tmp += a[i][k] * b[k][j];
            }
            res[i][j] = tmp % MOD;
        }
    }

    return res;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    for (auto &i: route) {
        int u, v;
        u = i.first, v = i.second;
        pos[0][u][v] = 1;
        pos[0][v][u] = 1;
    }

    for (int i = 1; i <= 31; i++) pos[i] = matrix(pos[i - 1], pos[i - 1]);

    cin >> d;
    ansvec[0][0] = 1;

    for (int i = 0; i <= 30; i++) {
        if ((d & (1 << i)) == 0) continue;
        ansvec = matrix(ansvec, pos[i]);
    }

    for (int i = 0; i < 8; i++) ans += ansvec[i][0];

    cout << ans % MOD;

    return 0;
}