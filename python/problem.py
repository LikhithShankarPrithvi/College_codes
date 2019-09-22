x=int(input("enter your number"))
a=[]
n=0
temp=x
while x!=0:
    x=x//10
    n=n+1
print("your number length=",n)
x=temp
while x!=0:
    z=x%10
    a.append(z)
    x=x//10
a.reverse()
for i in range(0,n):
    print(a)
    a[i]=0
    



