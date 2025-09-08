#include <iostream>
#include <vector>
#include <array>

using namespace std;

int N, res;
array<int, 100001> parent;
vector<pair<int, int>> v[3]; // 좌표, i번째 행성
vector<pair<int, pair<int, int>>> planet; // dis, A번째 행성, B번째 행성

int Find(int x) {
    if (parent[x] == x)
        return x;

    return parent[x] = Find(parent[x]);
}

bool SameParent(int a, int b) {
    a = Find(a);
    b = Find(b);

    if (a != b)
        return false;
    else
        return true;
}

void Union(int a, int b) {
    a = Find(a);
    b = Find(b);

    if (a != b)
        parent[a] = b;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int x, y, z;
    cin >> N;

    for (int i = 0; i < N; i++) {
        cin >> x >> y >> z;
        v[0].emplace_back(x, i);
        v[1].emplace_back(y, i);
        v[2].emplace_back(z, i);
        parent[i] = i;
    }

    sort(v[0].begin(), v[0].end());
    sort(v[1].begin(), v[1].end());
    sort(v[2].begin(), v[2].end());

    for (int i = 0; i < N - 1; i++) {
        planet.emplace_back(abs(v[0][i].first - v[0][i + 1].first), make_pair(v[0][i].second, v[0][i + 1].second));
        planet.emplace_back(abs(v[1][i].first - v[1][i + 1].first), make_pair(v[1][i].second, v[1][i + 1].second));
        planet.emplace_back(abs(v[2][i].first - v[2][i + 1].first), make_pair(v[2][i].second, v[2][i + 1].second));
    }

    sort(planet.begin(), planet.end());

    for (auto &i: planet) {
        if (!SameParent(i.second.first, i.second.second)) {
            res += i.first;
            Union(i.second.first, i.second.second);
        }

    }

    cout << res;

    return 0;
}