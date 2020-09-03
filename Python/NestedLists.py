if __name__ == '__main__':
    a=list()
    l=list()
    n=int(input())
    j=0
    while j<n:
        name = input()
        score = float(input())
        a.append(score)
        a.append(name)
        l.append(score)
        j=j+1
    y=list(set(l))
    y.sort()
    x=y[1]
    i=0
    b=list()
    while i<len(a)-1:
        if a[i]==x:
            b.append(a[i+1])
            i=i+1
        else:
            i=i+1
    b.sort()
    for i in b:
        print(i)
