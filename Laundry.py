# -*- coding: utf-8 -*-
"""
Created on Tue Sep 15 15:34:37 2020

@author: reube
"""

def minutesNeeded(m): 
    washing=25*m 
    drying = 25*m
    fold=10*m 
    time=(washing+drying+fold)-(25*(m-1)+10*(m-1))  
    return time
    
    
    
    
    
    
    
    
    
if __name__=="__main__": 
    print(minutesNeeded(1)) 
    print(minutesNeeded(2)) 
    print(minutesNeeded(3)) 
    print(minutesNeeded(12))