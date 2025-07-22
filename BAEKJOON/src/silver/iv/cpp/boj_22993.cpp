/**
 * 서든어택 3
 *
 * @file boj_22993.cpp
 * @brief 준원이만 생존하고 나머지 플레이어가 모두 죽게 만들 수 있다면 Yes를, 반대로 전투가 어떤 순서로 이루어져도 준원이가 절대 최후의 생존자가 될 수 없다면 No를 출력
 * @author Kyle
 * @date 2025-07-22
 */

#include <iostream>
#include <vector>
#include <sstream>

using namespace std;

int N;
vector<int> A;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> N;

    long long player;   // 준원의 누적 공격력
    int atk;
    cin >> player;

    string line;
    getline(cin >> ws, line);
    istringstream iss(line);
    while (iss >> atk)
        A.push_back(atk);

    sort(A.begin(), A.end());

    for (int a: A) {
        if (player > a) player += a;
        else {
            cout << "No";
            return 0;
        }
    }
    cout << "Yes";

    return 0;
}