/**
 * 특식 배부
 *
 * @file boj_27110.cpp
 * @brief 본인이 가장 선호하는 종류의 치킨을 받을 수 있는 최대 인원수를 출력
 * @author Kyle
 * @date 2025-06-27
 */

#include <iostream>
#include <sstream>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int n, sum = 0;
    cin >> n;

    string line;
    getline(cin >> ws, line);
    istringstream iss(line);

    for (int prefer; iss >> prefer;)
        sum += min(n, prefer);

    cout << sum;

    return 0;
}