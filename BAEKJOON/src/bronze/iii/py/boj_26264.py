# 빅데이터? 정보보호!

n = int(input())
s = input()

security = s.count("security")
bigdata = s.count("bigdata")

if security > bigdata:
    print("security!")
elif security < bigdata:
    print("bigdata?")
else:
    print("bigdata? security!")