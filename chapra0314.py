# -*- coding: utf-8 -*-
"""
Created on Fri Sep 18 17:04:59 2020

@author: reube
"""

import numpy as np

def rocket(t=0): 
    func_1=(10*t**2)-(5*t) 
    mask_1=(0<=t ) & (t<=8) 
    func_2=624-(3*t) 
    mask_2=(8<t)& (t<=16) 
    func_3=36*t+(12*(t-16)**2) 
    mask_3=(16<t) & (t<=26  )
    func_4=2136*(np.exp(-.1*(t-26))) 
    mask_4= (t>26 ) 
    print(mask_1)
    return func_1*mask_1 + func_2*mask_2 +  func_3* mask_3 + func_4*mask_4
        






if __name__=="__main__": 
    print(rocket(np.linspace(-4,29,45)))