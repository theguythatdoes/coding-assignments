# -*- coding: utf-8 -*-
"""
Created on Tue Oct 27 15:43:53 2020

@author: reube
"""

def howMany(meals,restaurant): 
    wyt=[]
    rest=[] 
    numrest=0
    for bob in range(len(meals)): 
        if meals[bob] not in rest: 
            rest+=[meals[bob] ]
        
    for k in range (len(rest)): 
        wyt+=rest[k].split(":")  
    y=wyt.count(restaurant)  
    return y
      
    
    
if __name__==("__main__"): 
    print(howMany(["Sue:Elmos", "Sue:Elmos", "Sue:Pitchforks"],"Elmos"))
    