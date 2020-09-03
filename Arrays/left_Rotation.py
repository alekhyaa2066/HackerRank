import math
import os
import random
import re
import sys



if __name__ == '__main__':
    nd = input().split()

    n = int(nd[0])

    d = int(nd[1])

    a = list(map(int, input().rstrip().split()))
    i=0
    while i<n:
        x=d%n
        print(a[x],end=' ')
        d=d+1
        i=i+1
    
