a=int(input("enter first no:"))
b=int(input("enter second no:"))
x=0
if (a>b):
    for i in range(1,b):
        if (a%i==0 and b%i==0):
            x=i
if (a<b):
    for i in range(1,a):
        if (a%i==0 and b%i==0):
            x=i
print(x)
            
