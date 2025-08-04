#include <bits/stdc++.h>

using namespace std;

int n, k;
int cnt[100001];
int visited[100001];
queue<int> q;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> n >> k;

    q.push(n);
    visited[n] = 1;
    cnt[n] = 1;

    while (!q.empty()) {
        int now = q.front();
        q.pop();
        for (int next: {now - 1, now + 1, now * 2}) {
            if (next < 0 || next > 100000)
                continue;
            if (!visited[next]) {
                q.push(next);
                visited[next] = visited[now] + 1;
                cnt[next] += cnt[now];
            } else if (visited[next] == visited[now] + 1)
                cnt[next] += cnt[now];
        }
    }

    cout << visited[k] - 1 << "\n" << cnt[k];

    return 0;
}