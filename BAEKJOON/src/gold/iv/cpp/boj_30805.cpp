#include <iostream>
#include <array>
#include <vector>

using namespace std;

int N, M;

bool cmp(array<int, 2> a, array<int, 2> b) {
    if (a[0] != b[0])
        return a[0] > b[0];
    return a[1] < b[1];
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> N;
    vector<array<int, 2>> arr1(N);
    for (int i = 0; i < N; i++)
        cin >> arr1[i][0], arr1[i][1] = i;

    cin >> M;
    vector<array<int, 2>> arr2(M);
    for (int i = 0; i < M; i++)
        cin >> arr2[i][0], arr2[i][1] = i;

    sort(arr1.begin(), arr1.end(), cmp);
    sort(arr2.begin(), arr2.end(), cmp);

    int i = 0, j = 0, l1 = 0, l2 = 0;
    vector<int> ans;

    while (i < N && j < M) {
        if (arr1[i][0] > arr2[j][0] || arr1[i][1] < l1)
            i++;
        else if (arr2[j][0] > arr1[i][0] || arr2[j][1] < l2)
            j++;
        else {
            ans.push_back(arr1[i][0]);
            l1 = arr1[i][1], l2 = arr2[j][1];
            i++, j++;
        }
    }

    cout << ans.size() << '\n';
    for (int &x: ans)
        cout << x << ' ';

    return 0;
}