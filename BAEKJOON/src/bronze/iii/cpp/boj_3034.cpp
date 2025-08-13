/**
 * 앵그리 창영
 *
 * @file boj_3034.cpp
 * @brief 각각의 성냥에 대해서, 박스안에 들어갈 수 있으면 "DA" 없으면 "NE"를 출력
 * @author Kyle
 * @date 2025-08-13
 */

#include <iostream>

using namespace std;

int N, W, H;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> N >> W >> H;

    for (int i = 0; i < N; ++i) {
        int l;
        cin >> l;
        cout << (l * l <= W * W + H * H ? "DA" : "NE") << '\n';
    }

    return 0;
}