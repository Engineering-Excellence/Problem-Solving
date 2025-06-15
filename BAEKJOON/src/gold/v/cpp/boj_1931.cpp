#include<iostream>
#include<algorithm>
#include<vector>

using namespace std;

int main() {
    int n, end, begin;
    vector<pair<int, int>> schedule;

    cin >> n;

    for (int i{0}; i < n; i++) {
        cin >> begin >> end;
        schedule.emplace_back(end, begin);
    }

    sort(schedule.begin(), schedule.end());

    int time = schedule[0].first;
    int count = 1;
    for (int i = 1; i < n; i++) {
        if (time <= schedule[i].second) {
            count++;
            time = schedule[i].first;
        }
    }

    cout << count;
}