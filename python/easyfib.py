t=int(input())
for i in range(t):
    n=int(input())
    k=0
    d=[0,1]
    x=1
    for j in range(n-2):
        y=k+x
        k=x
        x=y
        d.append(y%10)
    print(d)
    if(n%2==0):
        print(d[n-1])
    if(n%2==1):
        print(d[n-2])

