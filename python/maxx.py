import itertools
#def maxo(a,k):
 #   q=a[k]
  #  for j in range(len(q)):
   #     list1.append(q[j])
    #    list2=maxo(a,k-j)
     #   list1=list1+list2
k,m=map(int,input().split())
a=[]
c=0
d=[0,0,0,0,0,0,0]
max=0
for i in range(k):
    p=list(map(int,input().split()))
    d[i]=p[0]
    q=p[1:]
    a.append(q)
x=[]
list48=[]
for idly in a[0]:
    for wada in a[1]:
        for sambar in a[2]:
            for chutney in a[3]:
                for dosa in a[4]:
                    for utappam in a[5]:
                        for puri in a[6]:
                            x.extend((idly,wada,sambar,chutney,dosa,utappam,puri))
                            list48.append(x)
                            x=[]
smax=0
#lis=list(itertools.product(*a))
for i in list48:
    sum=0
    for j in i:
        sum=sum+(j**2)
    sum=sum%m
    if(sum>smax):
        smax=sum
print(smax)
    

