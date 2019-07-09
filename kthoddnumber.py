num11,num21=map(int,input().split())
arr=input().split()
arr1=[]
for i in arr:
  if int(i)%2!=0:
    arr1.append(i)
print(arr1[num21-1])
