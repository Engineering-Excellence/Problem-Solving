/**
 * 숫자 카드
 *
 * @file boj_10815.cpp
 * @brief 각 수가 적힌 숫자 카드를 상근이가 가지고 있으면 1을, 아니면 0을 공백으로 구분해 출력
 * @author Kyle
 * @date 2025-08-05
 */

#include <iostream>
#include <unordered_set>

using namespace std;

int N, M;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> N;
    unordered_set<int> cards(N);
    int card;

    for (int i = 0; i < N; i++) {
        cin >> card;
        cards.insert(card);
    }

    cin >> M;
    for (int i = 0; i < M; ++i) {
        cin >> card;
        if (cards.find(card) != cards.end())
            cout << 1 << ' ';
        else
            cout << 0 << ' ';
    }

    return 0;
}