#include <iostream>
#include <stack>
#include <string>

using namespace std;

string s;

int prior(char op) {    // 연산자 우선순위
    if (op == '(') return 0;
    if (op == '+' || op == '-') return 1;
    if (op == '*' || op == '/') return 2;
    return -1;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> s;
    stack<char> stk;

    for (auto c: s) {
        if (isalpha(c)) {
            cout << c;
        } else if (c == '(') {
            stk.push(c);
        } else if (c == ')') {
            while (!stk.empty() && stk.top() != '(') {
                cout << stk.top();
                stk.pop();
            }
            stk.pop();
        } else {
            while (!stk.empty() && prior(stk.top()) >= prior(c)) {
                cout << stk.top();
                stk.pop();
            }
            stk.push(c);
        }
    }

    while (!stk.empty()) {
        cout << stk.top();
        stk.pop();
    }

    return 0;
}