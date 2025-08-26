#include <iostream>
#include <vector>

using namespace std;

vector<int> pre;
int postidx = 0;

void postorder(int start, int end);

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int x;

    while (cin >> x)
        pre.push_back(x);

    postorder(0, 1000001);

    return 0;
}

void postorder(int start, int end) {
    if (postidx >= pre.size()) return;

    int v = pre[postidx];

    if (v < start || v > end)
        return;

    postidx++;
    postorder(start, v - 1);
    postorder(v + 1, end);

    cout << v << '\n';
}