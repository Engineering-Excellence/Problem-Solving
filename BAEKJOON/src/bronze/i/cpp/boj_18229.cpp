/**
 * 내가 살게, 아냐 내가 살게
 *
 * @file boj_18229.cpp
 * @brief 결제한 사람이 누구인지, 그 사람이 손을 뻗은 횟수는 몇 번인지를 의미하는 정수를 공백으로 구분하여 출력
 * @author Kyle
 * @date 2025-06-13
 */

#include <iostream>
#include <sstream>
#include <vector>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int n, m, k;
    cin >> n >> m >> k;

    vector<vector<int>> matrix;
    for (int i = 0; i < n; ++i) {
        string line;
        getline(cin >> ws, line);

        istringstream iss(line);
        vector<int> row;
        int a;

        while (iss >> a) {
            row.push_back(a);
        }
        matrix.push_back(row);
    }

    vector<int> acc(n, 0);
    for (int j = 0; j < matrix[0].size(); ++j) {    // 손을 뻗은 횟수
        for (int i = 0; i < matrix.size(); ++i) {   // 사람
            acc[i] += matrix[i][j];
            if (acc[i] >= k) {
                cout << i + 1 << " " << j + 1;
                return 0;
            }
        }
    }
}