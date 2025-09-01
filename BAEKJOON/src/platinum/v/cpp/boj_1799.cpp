#include <iostream>
#include <vector>
#include <unordered_set>

using namespace std;

int N;

bool bp_m(int x, vector<int> &match, vector<bool> &done, const vector<unordered_set<int>> &graph) {
    for (const int &y: graph[x]) {
        if (!done[y]) {
            done[y] = true;
            if (match[y] == -1 || bp_m(match[y], match, done, graph)) {
                match[y] = x;
                return true;
            }
        }
    }

    return false;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> N;

    vector<unordered_set<int>> graph((N << 1) - 1);

    for (int i = 0; i < N; ++i) {
        for (int j = 0; j < N; ++j) {
            int x;
            cin >> x;
            if (x) graph[i + j].insert(i - j + N - 1);
        }
    }

    vector<int> match((N << 1) - 1, -1);
    int cnt = 0;

    for (int i = 0; i < (N << 1) - 1; ++i) {
        vector<bool> done((N << 1) - 1, false);
        if (bp_m(i, match, done, graph)) ++cnt;
    }

    cout << cnt;

    return 0;
}