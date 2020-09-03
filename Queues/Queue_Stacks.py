n=int(input())
i=0
l=list()
while i<n:
    q=input().split()
    if int(q[0])==1:
        l.append(int(q[1]))
    elif int(q[0])==2:
        x=l[0]
        l.remove(x)
    elif int(q[0])==3:
        print(l[0])
    i=i+1
