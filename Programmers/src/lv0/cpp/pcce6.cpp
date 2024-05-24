#include <string>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

/**
 * <h1>[PCCE 기출문제] 6번 / 가채점</h1>
 *
 * @author Kyle
 * @param numbers 성적을 문의하려는 학생들의 번호가 담긴 정수 배열
 * @param our_score 가채점한 점수가 성적을 문의하려는 학생 순서대로 담긴 정수 배열
 * @param score_list 실제 성적이 번호 순서대로 담긴 정수 배열
 * @return 가채점한 점수가 실제 성적과 동일하다면 "Same"을, 다르다면 "Different"를 순서대로 배열에 담아 반환
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
