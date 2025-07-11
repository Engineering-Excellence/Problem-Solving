/**
 * 개표
 *
 * @file boj_10102.cpp
 * @brief 심사위원의 투표 결과가 주어졌을 때, 어떤 사람이 우승하는지 출력
 * @author Kyle
 * @date 2025-07-11
 */

#include <iostream>
#include <map>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int V;
    string line;
    map<char, int> vote{
            make_pair('A', 0),
            make_pair('B', 0)
    };

    cin >> V >> line;
    for (auto c: line) {
        vote[c]++;
    }

    if (vote['A'] > vote['B']) cout << 'A';
    else if (vote['A'] < vote['B']) cout << 'B';
    else cout << "Tie";

    return 0;
}