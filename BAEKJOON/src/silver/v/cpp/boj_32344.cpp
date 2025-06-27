#include <iostream>

using namespace std;

int ans_a;
long long int ans_sz;
int minX[100'001], minY[100'001], maxX[100'001], maxY[100'001];

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int R, C, N;
    cin >> R >> C;
    cin >> N;

    while (N--)
    {
        int a, v, h;
        cin >> a >> v >> h;

        if (!minX[a])
        {
            minX[a] = maxX[a] = v;
            minY[a] = maxY[a] = h;
        }
        else
        {
            minX[a] = min(minX[a], v);
            maxX[a] = max(maxX[a], v);
            minY[a] = min(minY[a], h);
            maxY[a] = max(maxY[a], h);
        }
    }

    for (int i = 1; i <= 100'000; i++)
    {
        if (!minX[i]) continue;
        const long long int sz = static_cast<long long int>(maxX[i] - minX[i] + 1) * static_cast<long long int>(maxY[i] - minY[i] + 1);
        if (sz > ans_sz)
        {
            ans_a = i;
            ans_sz = sz;
        }
    }

    cout << ans_a << ' ' << ans_sz << endl;

    return 0;
}
