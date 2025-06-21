/**
 * 너의 핸들은
 *
 * @file boj_15819.cpp
 * @brief 현정이가 기억하고 있는 핸들 중 사전 순으로 I번째인 핸들을 한 줄에 출력
 * @author Kyle
 * @date 2025-06-22
 */

#include <iostream>
#include <vector>

using namespace std;

int n, i;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> n >> i;

    vector<string> handles(n);
    for (int j = 0; j < n; ++j) {
        cin >> handles[j];
    }
    sort(handles.begin(), handles.end());

    cout << handles[i - 1];

    return 0;
}