/**
 * 입실 관리
 *
 * @file boj_5524.cpp
 * @brief 입실자의 이름을 소문자로 출력
 * @author Kyle
 * @date 2025-06-26
 */

#include <iostream>
#include <sstream>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int n;
    cin >> n;

    ostringstream oss;
    string name;

    for (int i = 0; i < n; ++i)
    {
        cin >> name;
        transform(name.begin(), name.end(), name.begin(), [](const unsigned char c)
        {
            return tolower(c);
        });
        oss << name << "\n";
    }

    cout << oss.str();

    return 0;
}