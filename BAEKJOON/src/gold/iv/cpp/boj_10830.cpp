#include <iostream>

using namespace std;

long long N, B;
long long A[5][5];
long long tmp[5][5];
long long ans[5][5];

void matrix_multi(long long x[5][5], long long y[5][5]) {
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            tmp[i][j] = 0; // 행렬 초기화
            for (int k = 0; k < N; k++) { //행렬 곱셈
                tmp[i][j] += (x[i][k] * y[k][j]);
            }
            tmp[i][j] %= 1000; //모듈러 곱셈
        }
    }

    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            x[i][j] = tmp[i][j];
        }
    }
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> N >> B;

    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            cin >> A[i][j];
        }
        ans[i][i] = 1; // 정답행렬 단위행렬로 초기화
    }

    while (B > 0) { //5 -> 2 -> 1
        if (B % 2 == 1) { //홀수이면 정답행렬에 A행렬 곱
            matrix_multi(ans, A); //ans: A -> A * A^4
        }
        matrix_multi(A, A); //지수법칙 A: A^2 -> A^4
        B /= 2;
    }

    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            cout << ans[i][j] << ' ';
        }
        cout << '\n';
    }

    return 0;
}