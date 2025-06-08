/**
 * 이진수 나눗셈
 *
 * @file boj_22950.cpp
 * @author Kyle
 * @date 2025-06-08
 */

#include <iostream>
#include <stack>

using namespace std;

/**
 * @brief 이진수 m이 2^k으로 나누어 떨어지는지 여부를 판별하는 프로그램
 *
 * @param n {int} 이진수 m의 자리수
 * @param m {string} 이진수
 * @param k {int} 나누는 수 2^k의 지수
 * @return {string} 이진수 m이 2^k으로 나누어 떨어진다면 YES, 나누어 떨어지지 않는다면 NO를 출력
 */
string solution(int n, string m, int k) {
    reverse(m.begin(), m.end());
    for (int i{0}; i < min(k, n); i++) {
        if (m[i] == '1') {
            return "NO";
        }
    }
    return "YES";
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int n, k;
    string m;

    cin >> n >> m >> k;

    cout << solution(n, m, k);

    return 0;
}