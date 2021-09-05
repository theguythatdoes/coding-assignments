# -*- coding: utf-8 -*-
"""
Created on Tue Sep 29 17:55:05 2020

@author: reube
"""

def theIndex(carrots,amount):  
    for k in range(1,amount+1):
        a=carrots.index(max(carrots)) 
        carrots[a]-=1 
    return a
        
         
            
            
        
        
        
            
     
    
    
    
    
    
    
    
    
    
if __name__=="__main__": 
    print(theIndex([5,8],4))