# -*- coding: utf-8 -*-
"""
Created on Wed Oct 28 16:06:39 2020

@author: reube
"""

def freqs(data): 
    goo=[] 
    boo=[]
    for k in sorted(set(data)): 
        goo+=[data.count(k)]  
    return goo
    
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
if __name__==("__main__"): 
    print(freqs(["apple", "pear", "cherry", "apple", "cherry", "pear", "apple", "banana"]))