#include <iostream>
#include <cmath>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int T;
    cin >> T;

    for (int t = 1; t <= T; ++t)
    {
        char gender, c;
        int momFeet, momInch, dadFeet, dadInch;

        cin >> gender >> momFeet >> c >> momInch >> c >> dadFeet >> c >> dadInch >> c;

        int momInches = momFeet * 12 + momInch;
        int dadInches = dadFeet * 12 + dadInch;
        double p = -1;
        int minInches = -1, maxInches = -1;

        if (gender == 'B')
        {
            p = (momInches + dadInches + 5) * 0.5;
            minInches = static_cast<int>(ceil(p - 4));
            maxInches = static_cast<int>(p + 4);
        }
        else
        {
            p = (momInches + dadInches - 5) * 0.5;
            minInches = static_cast<int>(ceil(p - 4));
            maxInches = static_cast<int>(p + 4);
        }

        cout << "Case #" << t << ": "
            << minInches / 12 << '\'' << minInches % 12 << '"' << " to "
            << maxInches / 12 << '\'' << maxInches % 12 << '"' << '\n';
    }

    return 0;
}
