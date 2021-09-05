# -*- coding: utf-8 -*-
"""
Created on Wed Oct 28 16:39:07 2020

@author: reube
"""

def getMaximumSubset(words):   
    bibidy=[] 
    jacko=[]
    counter=0
    for t in words:  
        bibidy+=[sorted(t)] 
    for bobidy in bibidy: 
        if bobidy not in jacko:  
            jacko+=[bobidy]
            counter+=1 
    print(jacko)
    return counter
        
        
            
            
        
    #for k in range(len(words)-1):  
        #if sorted(words[k])!=sorted(words[]): 
             #bibidy+=[words[k]] 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
if __name__==("__main__"):   
    print(getMaximumSubset(['wlrb', 'm', 'bhc', 'arz', 'wk', 'yhi', 'dqs', 'dxr', 'mowfr', 'sjyb']))
    
    