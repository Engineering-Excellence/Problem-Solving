#include <iostream>
#include <vector>
#include <queue>
#include <climits>

using namespace std;

constexpr int INF = INT_MAX / 3;

struct Node {
    int vertex;
    int weight;
};

vector<int> dijkstra(int start, vector<vector<Node>> &graph) {
    auto cmp = [](const Node &a, const Node &b) {
        return a.weight > b.weight;
    };
    priority_queue<Node, vector<Node>, decltype(cmp)> pq(cmp);
    vector<int> cost(graph.size(), INF);

    cost[start] = 0;
    pq.push({start, 0});

    while (!pq.empty()) {
        auto current = pq.top();
        pq.pop();
        if (cost[current.vertex] < current.weight) continue;
        for (auto next: graph[current.vertex]) {
            if (cost[next.vertex] > cost[current.vertex] + next.weight) {
                cost[next.vertex] = cost[current.vertex] + next.weight;
                pq.push({next.vertex, cost[next.vertex]});
            }
        }
    }

    return cost;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int V, E, target;
    cin >> V >> E >> target;

    vector<vector<Node>> graph(V + 1);
    vector<vector<Node>> reversedGraph(V + 1);

    for (int i = 0; i < E; ++i) {
        int to, from, time;
        cin >> to >> from >> time;
        graph[to].push_back({from, time});
        reversedGraph[from].push_back({to, time});
    }

    vector<int> go = dijkstra(target, reversedGraph);
    vector<int> back = dijkstra(target, graph);

    vector<int> total(V + 1);
    for (int i = 1; i <= V; ++i) total[i] = go[i] + back[i];

    int max_time = 0;
    for (int i = 1; i <= V; ++i) {
        max_time = max(max_time, total[i]);
    }

    cout << max_time;

    return 0;
}