n=int(input("enter no of strings"))
b=""
for i in range(n):
    x=input("enter string:")
    b=b+x
a=list(b)
k=input("enter the required string")
k2=list(set(list(k)))
k3=[]
for i in range(len(a)):
    if a[i] in k2:
        k3.append(a[i])
k4=[]
for i in k:
    for j in k3:
        if(i==j):
            k4.append(k3.count(j)//k.count(i))
print(min(k4))
