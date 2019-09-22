a=((x2-x1)/(v1-v2))
    if(v1>v2):
        if(a%1==0):
            res='YES'
        else:
            res='NO'
    if(v1<v2 or v1==v2 ):
        res='NO'
    if(x1==x2 and v1==v2):
        res='YES'
    if(x1>10000 or x2>10000):
        res='NO'
    return(res)
