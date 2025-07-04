#include <cstring>
#include <vector>
#include <iostream>

using namespace std;

struct Node {
    int index;
    int dist;
};

int v, maxDist, maxNode;
bool visited[100001]; // 방문확인
vector<Node> graph[100001];

void dfs(int node, int dist) {
    if (visited[node])  // 방문한 노드면 return
        return;

    if (maxDist < dist) {   // maxDist 갱신
        maxDist = dist;
        maxNode = node;
    }
    visited[node] = true; //방문 체크

    for (auto &i: graph[node]) {    // 현재 정점에서 연결 된 정점들로 dfs 수행
        int nextIndex = i.index;
        int nextDist = i.dist;
        dfs(nextIndex, nextDist + dist);
    }
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> v;
    int fr, to, dist;

    for (int i = 1; i < v + 1; i++) {
        cin >> fr;
        while (true) {
            cin >> to;
            if (to == -1)
                break;
            cin >> dist;
            graph[fr].push_back({to, dist});
            graph[to].push_back({fr, dist});
        }
    }

    dfs(1, 0);  // 임의의 정점 1에서 가장 거리가 먼 정점 찾기
    memset(visited, 0, sizeof(visited));
    maxDist = 0;

    dfs(maxNode, 0);    // 1과 가장 먼 정점에서 다시 dfs 수행하여 트리의 지름 찾기

    cout << maxDist;

    return 0;
}