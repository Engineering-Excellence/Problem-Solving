/**
 * 수학은 체육과목 입니다
 *
 * @file boj_15894.cpp
 * @brief 프랙탈 가장 아랫부분의 정사각형이 n개가 되었을 때, 실선으로 이루어진 도형의 둘레의 길이를 출력
 * @author Kyle
 * @date 2025-07-02
 */

#include <iostream>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    long long n;

    cin >> n;
    cout << 4 * n;

    return 0;
}
