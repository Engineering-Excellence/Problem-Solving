#include<iostream>
#include<deque>
#include<string>

using namespace std;

int t, n;
string strp, strn;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> t;

    while (t--) {
        cin >> strp;
        cin >> n;
        cin >> strn;

        deque<int> dq;
        bool flag = true;   //error
        bool dir = true;    //정방향 역방향
        string temp;

        for (int i = 1; i < strn.size(); i++)   //string to deque
        {
            if (strn[i] == ',' || strn[i] == ']') {
                if (!temp.empty()) {
                    dq.push_back(stoi(temp));
                    temp = "";
                }
            } else {
                temp += strn[i];
            }
        }

        for (char c: strp) {
            if (c == 'R') {
                dir = !dir;
            } else if (c == 'D') {
                if (dq.empty()) {
                    flag = false;
                    break;
                } else  //출력
                {
                    if (dir) dq.pop_front();
                    else dq.pop_back();
                }
            }
        }

        if (!flag) cout << "error\n";
        else {
            if (!dir) reverse(dq.begin(), dq.end());
            cout << "[";
            for (int i = 0; i < dq.size(); i++) {
                if (i == dq.size() - 1)
                    cout << dq[i];
                else
                    cout << dq[i] << ",";
            }
            cout << "]\n";
        }
    }
}