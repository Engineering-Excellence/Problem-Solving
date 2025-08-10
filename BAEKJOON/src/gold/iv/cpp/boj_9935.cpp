#include <iostream>
#include <stack>

using namespace std;

string word, boom;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> word >> boom;

    stack<char> s;
    string ans;
    ans.reserve(1000000); // 미리 할당해둠으로서 시간복잡도를 줄임

    for (int i = 0; i < word.length(); i++) {
        s.push(word[i]); // 스택에 넣음

        // 현재 탐색하는 문장의 단어가 폭발 문자열의 마지막 단어 && 스택에 있는 원소가 폭발 문자열 갯수 이상일때
        if (word[i] == boom[boom.length() - 1] && s.size() >= boom.length()) {
            string tmp;
            // 폭발 문자열의 길이만큼 스택에서 뺌
            for (int j = 0; j < boom.length(); j++) {
                tmp.push_back(s.top());
                s.pop();
            }
            reverse(tmp.begin(), tmp.end()); // 뺀 문자열 뒤집기

            // 뒤집은 문자열과 폭발문 문자열 같은지 판단
            if (tmp != boom) {
                // 다르다면 다시 스택에 넣음
                for (int j = 0; j < tmp.length(); j++) s.push(tmp[j]);
            }
        }
    }

    // 스택에 남은 원소들을 ans에 넣음
    while (!s.empty()) {
        ans.push_back(s.top());
        s.pop();
    }
    reverse(ans.begin(), ans.end()); // 뒤집어서 순서대로 나오게함

    if (ans.empty()) cout << "FRULA"; // 스택이 비어있다면 모두 폭발한 것
    else cout << ans;

    return 0;
}