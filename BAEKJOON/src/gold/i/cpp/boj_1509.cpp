#include <iostream>
#include <array>

#define INF (1e9+7)

using namespace std;

int N;
array<int, 2501> dp{};

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    string str;
    cin >> str;

    N = str.size();
    for (int idx{1}; idx < N + 1; ++idx) {
        dp[idx] = INF;
    }

    int i{1};
    int j{1};

    while (j < N + 1) {
        int k{i};
        int l{j};

        while (k > 0 && l < N + 1) {
            if (str[k - 1] == str[l - 1]) {
                dp[l] = min(dp[l], dp[k - 1] + 1);
                --k;
                ++l;
            } else
                break;
        }

        if (i == j)
            ++j;
        else
            ++i;
    }

    cout << dp[N];

    return 0;
}