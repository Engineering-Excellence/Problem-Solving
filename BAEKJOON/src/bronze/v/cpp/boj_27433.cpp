#include <iostream>

using namespace std;

long long N;

long long fact(long long num);

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> N;
    cout << fact(N);

    return 0;
}

long long fact(long long num) {
    return num >= 1 ? num * fact(num - 1) : 1;
}