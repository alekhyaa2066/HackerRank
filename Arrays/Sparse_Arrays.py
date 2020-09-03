import math
import os
import random
import re
import sys

def matchingStrings(strings, queries):
    l=list()
    for i in queries:
        j=0
        c=0
        while j<len(strings):
            if i==strings[j]:
                c=c+1
            j=j+1
        print(c)

# Complete the matchingStrings function below.
n=int(input())
i=0
ss=list()
while i<n:
    s=input()
    ss.append(s)
    i=i+1
j=0
q=int(input())
qq=list()
while j<q:
    x=input()
    qq.append(x)
    j=j+1
matchingStrings(ss,qq)
