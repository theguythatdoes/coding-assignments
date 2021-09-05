# -*- coding: utf-8 -*-
"""
Created on Tue Oct 27 17:03:38 2020

@author: reube
"""

def networth(transactions): 
   f=[] 
   "blueman=[] "
   d={} 
   "z=0"
   for k in range(len(transactions)):  
       f=transactions[k].split(":")  
       f[2]=int(float(f[2])*100)
       if f[1] not in d:  
           d[f[1]]=f[2] 
       else: 
            d[f[1]]+=f[2] 
       if f[0] not in d:  
            d[f[0]]=-f[2] 
       else: 
            d[f[0]]-=f[2] 
   result=[]
   for p in  d: 
       entry="{}:{}".format(p,d[p]/100)
       result.append(entry)
   result.sort()
   return(result)
       
                
            
            
  
        
   
   
    
    
    
    
    
    
    
    
    
if __name__==("__main__"): 
    #print(networth(["adam:eve:123"])) 
    print(networth(["owen:susan:10", "owen:robert:10", "owen:drew:10"]))
        