a='butterfly'
print(a)
c=[]
k=len(a)
print(k)
b=[]
for i in range(0,k):
    b=a[i]
    c.append(b)
print(c)
c.reverse()
print(c)
sum=str()
for i in range(1,k-1):
    sum=sum+c[i]
print(sum)
print(a[0]+sum+a[k-1])
