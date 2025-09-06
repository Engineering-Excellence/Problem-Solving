#include <iostream>
#include <vector>
#include <numeric>

using namespace std;

int N, M, K;
vector<int> card;

class UnionFind {
private:
    std::vector<int> parent;

public:
    explicit UnionFind(int n) {
        parent.resize(n);
        iota(parent.begin(), parent.end(), 0);
    }

    int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }

    bool unite(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX != rootY) {
            if (rootX < rootY) {
                std::swap(rootX, rootY);
            }
            parent[rootY] = rootX;
            return true;
        }
        return false;
    }
};

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> N >> M >> K;
    card.resize(M);
    for (int &c: card) cin >> c;
    sort(card.begin(), card.end());

    UnionFind uf(M);

    for (int i = 0; i < K; i++) {
        int n;
        cin >> n;

        auto ub = upper_bound(card.begin(), card.end(), n);
        int idx = distance(card.begin(), ub);

        int root = uf.find(idx);
        cout << card[root] << '\n';
        if (root != M - 1) uf.unite(root, root + 1);
    }

    return 0;
}