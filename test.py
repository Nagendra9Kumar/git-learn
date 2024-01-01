li =[1,2,4,9,7,5,3,10]
len = len(li)
j=0
try:
    while j<len:
        for i in range(1,len):
            if li[i-1] > li[i]:
                li[i-1],li[i]=li[i],li[i-1]
        j=j+1
except Exception as e:
    print(e)
else:
    print(li)
