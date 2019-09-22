n = int(input())
arr = map(int, input().split())
k=max(arr)
a=[]
for i in arr:
    if(i!=k):
        a.append(i)
l=max(a)
print(l)
