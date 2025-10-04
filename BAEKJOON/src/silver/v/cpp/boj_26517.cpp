#include <iostream>

using namespace std;

long long k, a, b, c, d;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> k >> a >> b >> c >> d;

    long long lLim = a * k + b;
    long long rLim = c * k + d;

    cout << (lLim == rLim ? "Yes " + to_string(lLim) : "No");

    return 0;
}