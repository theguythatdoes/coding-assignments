# -*- coding: utf-8 -*-
"""

I understand and have adhered to all the tenets of the Duke
  Community Standard in completing every part of this assignment.  I
  understand that a violation of any part of the Standard on any part
  of this assignment can result in failure of this assignment, failure
  of this course, and/or suspension from Duke University.
""" 
import math as m
import numpy as np

def volume(d,r):  
    if d>3*r: 
        print("Overtop")   
        return -1
    if d<=3*r or d>=r: 
        return( np.pi*r**2*(d-r))+(np.pi*r**2*(r))/3 
    elif d<=r: 
        return (np.pi*d**2*d)/3  
    
    
    
    
if __name__=="__main__": 
    print(volume(1,.9)) 
    print(volume(1.25,1)) 
    print(volume(3.8,1.4)) 
    print(volume(4.5,1.3))
    
    
    
    
    
    
    
