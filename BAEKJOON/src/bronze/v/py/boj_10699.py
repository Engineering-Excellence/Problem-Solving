# 오늘 날짜
import datetime

# from zoneinfo import ZoneInfo


# print(datetime.datetime.now(ZoneInfo('Asia/Seoul')).strftime('%Y-%m-%d'))
print((datetime.datetime.now() + datetime.timedelta(hours=9)).strftime("%Y-%m-%d"))
