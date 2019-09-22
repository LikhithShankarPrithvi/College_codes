x=int(input("enter your number"))
n=0
temp=x
while x!=0:
    x=x//10
    n=n+1
print("your number length=",n)
x=temp
for i in range(0,n):
    for j in range(0,i):
        print(end=" ")
    print(x)
    x=x%(10**(n-i-1))

        
    
