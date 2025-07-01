/**
 * 왕복
 *
 * @file boj_18311.cpp
 * @brief 지나고 있는 코스의 번호를 출력
 * @author Kyle
 * @date 2025-07-01
 */

#include <iostream>
#include <vector>
#include <sstream>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int N;
    long long K, pos = 0;
    cin >> N >> K;

    string line, interval;
    getline(cin >> ws, line);
    istringstream iss(line);

    vector<int> course;
    while (iss >> interval)
    {
        course.push_back(stoi(interval));
    }

    for (int n = 1; n <= N; ++n)
    {
        if (K >= pos && K < pos + course[n - 1])
        {
            cout << n;
            return 0;
        }
        pos += course[n - 1];
    }

    for (int n = N; n >= 1; --n)
    {
        if (K >= pos && K < pos + course[n - 1])
        {
            cout << n;
            return 0;
        }
        pos += course[n - 1];
    }
}
