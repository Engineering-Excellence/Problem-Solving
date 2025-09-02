#include <iostream>
#include <vector>
#include <cassert>
#include <numeric>

using namespace std;

struct interval {
    long long x1, y1, x2, y2;
    long long a, b, c;

    interval(long long p, long long q, long long r, long long s) {
        x1 = p, y1 = q;
        x2 = r, y2 = s;
        if (x1 > x2)
            swap(x1, x2), swap(y1, y2);
        else if (x1 == x2 && y1 < y2)
            swap(y1, y2);

        a = y1 - y2, b = x2 - x1;
        long long g = gcd(abs(a), b);
        a /= g, b /= g;

        c = -(a * x1 + b * y1);
        assert(a * x2 + b * y2 + c == 0LL);
    }

    long long L(long long x, long long y) const {
        return a * x + b * y + c;
    }
};

vector<int> par, sz;

int find(int i) {
    if (par[i] < 0) return i;
    return (par[i] = find(par[i]));
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int N;
    cin >> N;
    vector<interval> list;
    long long x1, y1, x2, y2;

    for (int i = 0; i < N; i++) {
        cin >> x1 >> y1 >> x2 >> y2;
        assert(x1 != x2 || y1 != y2);
        list.emplace_back(x1, y1, x2, y2);
    }

    int cnt_comp = N, max_sz = 1;
    par.resize(N, -1), sz.resize(N, 1);

    for (int i = 0; i < N; i++) {
        for (int j = i + 1; j < N; j++) {
            if (list[i].a != list[j].a || list[i].b != list[j].b || list[i].c != list[j].c) {
                if (list[i].L(list[j].x1, list[j].y1) * list[i].L(list[j].x2, list[j].y2) <= 0 &&
                    list[j].L(list[i].x1, list[i].y1) * list[j].L(list[i].x2, list[i].y2) <= 0) {
                    int I = find(i), J = find(j);
                    if (I != J) {
                        cnt_comp--;
                        par[J] = I;
                        max_sz = max(sz[I] += sz[J], max_sz);
                    }
                }
            } else {
                if ((list[i].x1 < list[i].x2 && list[i].x1 <= list[j].x2 && list[j].x1 <= list[i].x2) ||
                    (list[i].x1 == list[i].x2 && list[i].y2 <= list[j].y1 && list[j].y2 <= list[i].y1)) {
                    int I = find(i), J = find(j);
                    if (I != J) {
                        cnt_comp--;
                        par[J] = I;
                        max_sz = max(sz[I] += sz[J], max_sz);
                    }
                }
            }
        }
    }

    cout << cnt_comp << '\n' << max_sz << '\n';

    return 0;
}