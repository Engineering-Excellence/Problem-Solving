/* Sort 마스터 배지훈 */

#include <iostream>

using namespace std;

int N;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int ans{-1};

    cin >> N;
    for (int i = 0; i < N; ++i) {
        int a;
        cin >> a;
        ans = max(ans, a);
    }

    cout << ans;

    return 0;
}