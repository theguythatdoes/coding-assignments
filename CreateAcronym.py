# -*- coding: utf-8 -*-
"""
Created on Tue Sep 22 15:34:58 2020

@author: reube
"""

def acronym(phrase):  
    y=phrase 
    phrase=phrase.split(' ')
    mystring=len(phrase) 
    s=''
    for k in range(0,mystring):  
        n=phrase[k] 
        s+=n[0] 
        
    return s
    
    
    
    
if __name__=="__main__": 
    print(acronym("dog ate my homework"))
        
    