#include <string>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

/**
 * <h1>[PCCE 기출문제] 6번 / 가채점</h1>
 * @author
 * @param numbers
 * @param our_score
 * @param score_list
 * @return
 */
vector<string> solution(vector<int> numbers, vector<int> our_score, vector<int> score_list) {
    int num_student = numbers.size();
    vector<string> answer(num_student);

    for (int i = 0; i < num_student; i++) {
        if (our_score[i] == score_list[numbers[i] - 1]) {
            answer[i] = "Same";
        } else {
            answer[i] = "Different";
        }
    }

    return answer;
}

void printvector(vector<string> v) {
    for_each(v.begin(),
             v.end(),
             [](const string &elem) {
                 cout << elem << " ";
             });
    cout << endl;
}

int main() {
    vector<string> result = solution({1}, {100}, {100, 80, 90, 84, 20});
    printvector(result);
    result = solution({3, 4}, {85, 93}, {85, 92, 38, 93, 48, 85, 92, 56});
    printvector(result);
    return 0;
}
