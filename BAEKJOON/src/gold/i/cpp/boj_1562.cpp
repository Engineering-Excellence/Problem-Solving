#include <iostream>
#include <cstring>

using namespace std;

constexpr long long MOD = 1000000000LL;

int N;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> N;

    if (N < 10) {
        cout << 0 << "\n";
        return 0;
    }

    const int FULL = (1 << 10) - 1; // 1023
    static long long dp[10][1 << 10], nxt[10][1 << 10];

    for (int d = 1; d <= 9; d++)    // 초기화: 길이 1, 맨 앞 0 금지
        dp[d][1 << d] = 1;

    for (int len = 2; len <= N; len++) {
        for (auto &d: nxt)  // nxt 초기화
            memset(d, 0, sizeof(d));

        for (int last = 0; last <= 9; last++) {
            for (int mask = 0; mask <= FULL; mask++) {
                long long cur = dp[last][mask];
                if (!cur) continue;

                if (last - 1 >= 0) {
                    int nd = last - 1;
                    int nmask = mask | (1 << nd);
                    nxt[nd][nmask] = (nxt[nd][nmask] + cur) % MOD;
                }
                if (last + 1 <= 9) {
                    int nd = last + 1;
                    int nmask = mask | (1 << nd);
                    nxt[nd][nmask] = (nxt[nd][nmask] + cur) % MOD;
                }
            }
        }

        for (int d = 0; d < 10; d++)
            memcpy(dp[d], nxt[d], sizeof(dp[d]));
    }

    long long ans = 0;
    for (int last = 0; last <= 9; last++) {
        ans = (ans + dp[last][FULL]) % MOD;
    }

    cout << ans;

    return 0;
}