# -*- coding: utf-8 -*-
"""
Created on Tue Sep 22 16:58:32 2020

@author: reube
"""


def maxPoints(toss): 
    b=toss
    f=[0,0,0,0,0,0]  
    for k in b: 
        f[k-1]+=k
                   #iterates through lists without the use of range
        
            
       


    return max(f)


if __name__=="__main__": 
    print(maxPoints([5,3,3,1,2]))
    print(maxPoints([3,3,3,1,2]))