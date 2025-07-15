#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

void bf(const int n, const vector<tuple<int, int, int>> &edges) {
    vector<int> dist(n + 1);

    for (int i = 0; i < n - 1; ++i) {
        for (const auto &[w, u, v]: edges) {
            if (dist[u] + w < dist[v]) {
                dist[v] = dist[u] + w;
            }
        }
    }

    for (const auto &[w, u, v]: edges) {
        if (dist[u] + w < dist[v]) {
            cout << "YES\n";
            return;
        }
    }
    cout << "NO\n";
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int TC;
    cin >> TC;

    while (TC--) {
        vector<tuple<int, int, int>> edges;
        int N, M, W;
        cin >> N >> M >> W;

        for (int i = 0; i < M; ++i) {
            int S, E, T;
            cin >> S >> E >> T;
            edges.emplace_back(T, S, E);
            edges.emplace_back(T, E, S);
        }

        for (int i = 0; i < W; ++i) {
            int S, E, T;
            cin >> S >> E >> T;
            edges.emplace_back(-T, S, E);
        }

        bf(N, edges);
    }

    return 0;
}