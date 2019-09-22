# Enter your code here. Read input from STDIN. Print output to STDOUT
import re
t=int(input())
for j in range(t):
    x=input()
    lis=list(x)
    digits=re.findall("\d",x,flags=0)
    point=re.findall("[.]",x,flags=0)
    count1=count2=count3=0
    for i in lis:
        if(i=='+' or i=='-'):
            count1+=1
        if(i in point):
            count2+=1
        if(i in digits):
            count3+=1
    print(digits)
    print(count1,count2,count3)
    count4=0
    for i in lis[1:]:
        if(i=='+' or i=='-'):
            count4=1
    if(count1>=2 or count2>=2):
        print("False")
    elif(count1+count2+count3+count4==len(lis)):
        print("True")
    else:
        print("False")
    
