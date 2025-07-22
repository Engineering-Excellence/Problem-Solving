#include <iostream>
#include <vector>
#include <queue>

using namespace std;

int n, m;

vector<int> parentMark(1001, 0);
vector<int> costMark(1001, 100'000'000);
vector<vector<pair<int, int>>> edges(1001);

int dijkstra(const int &start, const int &dest) {
    priority_queue<pair<int, int>, vector<pair<int, int>>, greater<>> pq;
    pq.emplace(0, start);
    costMark[start] = 0;

    while (!pq.empty()) {
        auto [cost, root] = pq.top();
        pq.pop();

        if (root == dest) return cost;

        for (auto [i, fee]: edges[root]) {
            int nextCost = cost + fee;
            if (nextCost < costMark[i]) {
                costMark[i] = nextCost;
                parentMark[i] = root;
                pq.emplace(nextCost, i);
            }
        }
    }

    return -1;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> n >> m;
    while (m--) {
        int u, v, w;
        cin >> u >> v >> w;
        edges[u].emplace_back(v, w);
    }

    int start, dest;
    cin >> start >> dest;

    cout << dijkstra(start, dest) << '\n';

    int now = dest;
    vector<int> route;
    while (now != 0) {
        route.push_back(now);
        now = parentMark[now];
    }

    reverse(route.begin(), route.end());
    cout << route.size() << '\n';
    for (const int &node: route) {
        cout << node << ' ';
    }

    return 0;
}