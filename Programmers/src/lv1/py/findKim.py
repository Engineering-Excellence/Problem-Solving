def solution(seoul: list) -> str:
    """
    서울에서 김서방 찾기

    :param seoul: String형 배열
    :type seoul: list
    :return: seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환
    :rtype: str
    """
    return f'김서방은 {seoul.index("Kim")}에 있다'


print(solution(seoul=["Jane", "Kim"]))
