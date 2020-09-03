def jumpingOnClouds(c):
    l=len(c)
    count=0
    i=0 
    while i<l:
        if i+2<l:
            if c[i+2]!=1:
                count=count+1
                i=i+2
            else:
                count=count+1
                i=i+1
        else:
            count=count+1
            i=i+1
    return count-1
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    c = list(map(int, input().rstrip().split()))

    result = jumpingOnClouds(c)

    fptr.write(str(result) + '\n')

    fptr.close()
