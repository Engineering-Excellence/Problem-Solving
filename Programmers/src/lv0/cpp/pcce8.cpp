#include <string>
#include <vector>
#include <iostream>

using namespace std;

/**
 * <h1>[PCCE 기출문제] 8번 / 창고 정리</h1>
 *
 * @author Kyle
 * @param storage 정리되기 전 창고의 물건 이름이 담긴 문자열 배열
 * @param num 각 물건의 개수가 담긴 정수 배열
 * @return 정리된 창고에서 개수가 가장 많은 물건의 이름을 반환
 */
string solution(vector<string> storage, vector<int> num) {
    int num_item = 0;
    vector<string> clean_storage(storage.size());
    vector<int> clean_num(num.size());

    for (int i = 0; i < storage.size(); i++) {
        int clean_idx = -1;
        for (int j = 0; j < num_item; j++) {
            if (storage[i] == clean_storage[j]) {
                clean_idx = j;
                break;
            }
        }
        if (clean_idx == -1) {
            clean_storage[num_item] = storage[i];
            clean_num[num_item] = num[i];
            num_item += 1;
        } else {
            clean_num[clean_idx] += num[i];
        }
    }

    // 아래 코드에는 틀린 부분이 없습니다.
    int num_max = -1;
    string answer = "";
    for (int i = 0; i < num_item; i++) {
        if (clean_num[i] > num_max) {
            num_max = clean_num[i];
            answer = clean_storage[i];
        }
    }

    return answer;
}

int main() {
    cout << solution({"pencil", "pencil", "pencil", "book"}, {2, 4, 3, 1}) << endl;
    cout << solution({"doll", "doll", "doll", "doll"}, {1, 1, 1, 1}) << endl;
    cout << solution({"apple", "steel", "leaf", "apple", "leaf"}, {5, 3, 5, 3, 7}) << endl;
    cout << solution({"mirror", "net", "mirror", "net", "bottle"}, {4, 1, 4, 1, 5}) << endl;

    return 0;
}
