#include <iostream>
#include <cmath>

using namespace std;

int N, sum = 0;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> N;

    while (N) {
        sum += pow(N % 10, 5);
        N /= 10;
    }

    cout << sum;

    return 0;
}