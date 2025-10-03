/* 동전 게임 */

#include <iostream>
#include <array>

#define CASE 8
#define endl '\n'

using namespace std;

int P;
const array<string, CASE> patterns = {"TTT", "TTH", "THT", "THH", "HTT", "HTH", "HHT", "HHH"};

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> P;

    for (int i = 0; i < P; ++i) {
        array<int, CASE> ans{0};
        string trial;
        cin >> trial;

        for (int j = 0; j < trial.length() - patterns[0].length() + 1; ++j)
            for (int k = 0; k < patterns.size(); ++k)
                if (trial.substr(j, patterns[0].length()) == patterns[k])
                    ans[k]++;

        for (int cnt: ans)
            cout << cnt << ' ';
        cout << endl;
    }

    return 0;
}