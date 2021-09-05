# -*- coding: utf-8 -*-
"""
Created on Wed Oct 28 15:25:31 2020

@author: reube
""" 
def total(scores): 
    spacecurve=[]  
    blob=0
    for k in range( len(scores)) :
        spacecurve+=[scores[k].split()] 
    for p in range(len(spacecurve)): 
        for z in range(len(spacecurve[p])): 
            spacecurve[p][z]=int(spacecurve[p][z])  
        blob+=max(spacecurve[p]) 
    return blob
   
            
    
    
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
if __name__==("__main__"):   
    print(total( ['1 0', '1 1']))
    

