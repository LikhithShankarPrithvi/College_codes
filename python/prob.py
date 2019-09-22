word=input()
a=[]
x=0
for i in word:
    for j in range(97,122):
        if (ord(i)==j):
            k=j-97
            a.append(k)
for i in a:
    if (x<=h[i]):
        x=h[i]
return (x*len(word))
    
