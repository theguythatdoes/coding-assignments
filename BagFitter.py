# -*- coding: utf-8 -*-
"""
Created on Tue Sep 29 09:20:10 2020

@author: reube 

"""  
import math
def bags(strength,food):  
    a=list(set(food))
    b=[]
    p=0
    for k in range(0,len(a)) :  
        b+=[food.count(a[k])]  
        p+= math.ceil((b[k]/strength))
        
        
    return p
    
   
    

    
    
    
    
if __name__=="__main__": 
    print(bags(2,("dairy","dairy","banana","buns")))        