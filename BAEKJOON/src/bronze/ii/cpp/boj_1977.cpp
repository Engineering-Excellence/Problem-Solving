/**
 * 완전제곱수
 *
 * @file boj_1977.cpp
 * @brief M이상 N이하의 자연수 중 완전제곱수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력
 * @author Kyle
 * @date 2025-06-19
 */

#include <iostream>
#include <cmath>

using namespace std;

int m, n;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> m >> n;

    int min = 0, sum = 0;
    for (int i = m; i <= n; ++i) {
        int num = (int) sqrt(i);
        if (i == num * num) {
            sum += i;
            if (min == 0)
                min = i;
        }
    }

    if (!sum)
        cout << -1;
    else
        cout << sum << '\n' << min;

    return 0;
}