#include<iostream>

#define INT_MAX 0x5fffffff

using namespace std;

int n;
int adj[16][16];
int dp[1 << 15][15];    // visited, last node

int solve() {
    for (int i = 0; i < n - 1; i++) {
        if (adj[n - 1][i] == 0)
            continue;
        dp[1 << i][i] = adj[n - 1][i];
    }

    for (int i = 1; i < (1 << (n - 1)) - 1; i++) {
        for (int j = 0; j < n - 1; j++) {
            if ((i & (1 << j)) == 0 || dp[i][j] == INT_MAX)
                continue;

            for (int newNode = 0; newNode < n - 1; newNode++) {
                int newFlag = i | (1 << newNode);
                if (i == newFlag)
                    continue;

                if (adj[j][newNode] > 0) {
                    dp[newFlag][newNode] = min(dp[newFlag][newNode], dp[i][j] + adj[j][newNode]);
                }
            }
        }
    }

    int result = INT_MAX;
    for (int i = 0; i < n - 1; i++) {
        if (adj[i][n - 1] == 0 || dp[(1 << (n - 1)) - 1][i] == INT_MAX)
            continue;
        int value = dp[(1 << (n - 1)) - 1][i] + adj[i][n - 1];
        result = min(result, value);
    }

    return result;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> n;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cin >> adj[i][j];
        }
    }

    for (int i = 0; i < (1 << (n - 1)); i++) {
        for (int j = 0; j < n - 1; j++) {
            dp[i][j] = INT_MAX;
        }
    }

    cout << solve();

    return 0;
}