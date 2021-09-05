# -*- coding: utf-8 -*-
"""
Created on Tue Sep 15 21:16:02 2020

@author: reube
"""
import math as m
import numpy as np

def geo_prog(start,end,ratio): 
    s=start
    r=ratio 
    e=end
    g=[]  
    try: 
        float(s) 
        float(r) 
        float(e) 
    except Exception as uhoh:  
        print("All arguments must be positive.")
        return -1,-1
    try: 
        s//2 or r//2 or e//2
    except Exception as uhoh: 
        print("All numbers must be single numbers.")
        return -1,-1  
        if s!=float(s): 
            print("All numbers must be single numbers.") 
            return -1,-1
    
    if s<0 or r<0 or e<0: 
        print("All arguments must be positive.") 
        return -2,-2  
    if s>e and r>=1: 
        print("Invalid sequence.") 
        return -3,-3
    if e>s and r<1 : 
        print("Invalid sequence.") 
        return -3,-3 
    if s>e:
        while (s>e):  
            g+=[s] 
            s=s*r 
            z=sum(g)
            if s==e: 
                g+=[e] 
                z=sum(g)  
    elif s<e:
        while  s<e: 
            g+=[s] 
            s=s*r  
            z=sum(g)
            if s==e: 
                g+=[e] 
                z=sum(g)       
    return g,z 





if __name__=="__main__":
    print(geo_prog(4,64,2))