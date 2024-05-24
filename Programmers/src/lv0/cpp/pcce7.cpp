#include <string>
#include <iostream>

using namespace std;

/**
 * func1: "target" 모드
 *
 * @param humidity 현재 공기 중 습도를 나타낸 정수
 * @param val_set 설정값을 나타낸 정수
 * @return 가습기 단계
 */
int func1(int humidity, int val_set) {
    if (humidity < val_set)
        return 3;
    return 1;
}

/**
 * func2: "auto" 모드
 *
 * @param humidity 현재 공기 중 습도를 나타낸 정수
 * @return 가습기 단계
 */
int func2(int humidity) {
    if (humidity >= 50)
        return 0;
    else if (humidity >= 40)
        return 1;
    else if (humidity >= 30)
        return 2;
    else if (humidity >= 20)
        return 3;
    else if (humidity >= 10)
        return 4;
    else
        return 5;
}

/**
 * func3: "minimum"모드
 *
 * @param humidity 현재 공기 중 습도를 나타낸 정수
 * @param val_set 설정값을 나타낸 정수
 * @return 가습기 단계
 */
int func3(int humidity, int val_set) {
    if (humidity < val_set)
        return 1;
    return 0;
}

/**
 * <h1>[PCCE 기출문제] 7번 / 가습기</h1>
 *
 * @author Kyle
 * @param mode_type 설정한 가습기의 모드
 * @param humidity 현재 공기 중 습도를 나타낸 정수
 * @param val_set 설정값을 나타낸 정수
 * @return 현재 가습기가 몇 단계로 작동 중인지 반환
 */
int solution(string mode_type, int humidity, int val_set) {
    int answer = 0;
    if (mode_type == "auto") {
        answer = func2(humidity);
    } else if (mode_type == "target") {
        answer = func1(humidity, val_set);
    } else if (mode_type == "minimum") {
        answer = func3(humidity, val_set);
    }
    return answer;
}

int main() {
    cout << solution("auto", 23, 45) << endl;
    cout << solution("target", 41, 40) << endl;
    cout << solution("minimum", 10, 34) << endl;

    return 0;
}
