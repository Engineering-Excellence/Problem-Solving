#include <iostream>
#include <algorithm>
#include <queue>
#include <unordered_map>

using namespace std;

constexpr int MASK = 15;
constexpr int SHIFT = 4;

int N;

struct Inst {
    int l, r, c;

    const int execute(long long num) const {
        long long l_value = (num >> SHIFT * (N - l)) & MASK;
        long long r_value = (num >> SHIFT * (N - r)) & MASK;
        num -= (l_value << SHIFT * (N - l)) + (r_value << SHIFT * (N - r));
        num += (l_value << SHIFT * (N - r)) + (r_value << SHIFT * (N - l));
        return num;
    }
};

istream &operator>>(istream &is, Inst &i) {
    is >> i.l >> i.r >> i.c;
    return is;
}

const int VectorToInt(const vector<int> &v) {
    int value = 0;
    for (int i: v) {
        value <<= SHIFT;
        value += i;
    }
    return value;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> N;

    vector<int> v(N);
    for (auto &i: v) {
        cin >> i;
        --i;
    }

    int M;
    cin >> M;

    vector<Inst> insts(M);
    for (auto &inst: insts) {
        cin >> inst;
    }

    unordered_map<long long, int> m;
    priority_queue<pair<int, long long>,
            vector<pair<int, long long>>,
            greater<>>
            pq;
    pq.emplace(0, VectorToInt(v));
    m[VectorToInt(v)] = 0;

    vector<int> idle_v(v);
    sort(idle_v.begin(), idle_v.end(), less<>());
    const int idle_value = VectorToInt(idle_v);

    while (!pq.empty() && pq.top().second != idle_value) {
        const auto now(pq.top());
        pq.pop();

        if (m[now.second] < now.first) {
            continue;
        }
        --m[now.second];

        for (const auto &inst: insts) {
            const pair<int, int> temp = {now.first + inst.c,
                                         inst.execute(now.second)};

            auto iter = m.find(temp.second);

            if (iter == m.end() || iter->second > temp.first) {
                pq.emplace(temp);
                m[temp.second] = temp.first;
            }
        }
    }

    cout << (pq.empty() ? -1 : pq.top().first);

    return 0;
}