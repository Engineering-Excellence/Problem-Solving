#include <string>
#include <vector>
#include <iostream>

using namespace std;

/**
 * <h1>[PCCE 기출문제] 5번 / 산책</h1>
 *
 * @author Kyle
 * @param route 산책루트가 담긴 문자열
 * @return 도착점의 위치
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
    cout << "동쪽으로 " << result[0] << "칸, 북쪽으로 " << result[1] << "칸 이동했습니다." << endl;

    return 0;
}
