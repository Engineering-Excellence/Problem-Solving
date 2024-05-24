#include <string>
#include <vector>
#include <iostream>

using namespace std;

/**
 * <h1>[PCCE ���⹮��] 5�� / ��å</h1>
 *
 * @author Kyle
 * @param route ��å��Ʈ�� ��� ���ڿ�
 * @return �������� ��ġ
 */
vector<int> solution(string route) {
    int east = 0;
    int north = 0;
    vector<int> answer(2);
    for (int i = 0; i < route.length(); i++) {
        switch (route[i]) {
            case 'N':
                north++;
                break;
            case 'S':
                north--;
                break;
            case 'E':
                east++;
                break;
            case 'W':
                east--;
                break;
        }
    }
    answer[0] = east;
    answer[1] = north;
    return answer;
}

int main() {
    string route = "NSSNEWWN";
    vector<int> result = solution(route);
    cout << "�������� " << result[0] << "ĭ, �������� " << result[1] << "ĭ �̵��߽��ϴ�." << endl;

    return 0;
}
