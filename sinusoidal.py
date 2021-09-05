# -*- coding: utf-8 -*-
"""
Created on Fri Sep 18 18:09:00 2020

@author: reube
""" 
import math as m
import numpy as np
import matplotlib.pyplot as plt

def y(t,A, omega, phi):  
    t=np.linspace(-2*np.pi,2*np.pi, 101) 
    x1= A*np.cos(omega*t+phi)
    fig=plt.figure(num=1, clear= True) 
    ax=fig.add_subplot(1,1,1) 
    ax.plot(t,x1,'b-o' , label="y(t,1,1,0)" , markevery= 10,markerfacecolor='magenta',markeredgecolor='r')
    ax.plot(t,2*np.cos(1*t+0),'y--s',label="y(t,2,1,0", markevery=10,markeredgecolor='r',markerfacecolor='magenta') 
    ax.plot(t,1*np.cos(2*t+0),'b:p',label="y(t,1,2,0)", markevery=10, markeredgecolor='c',markerfacecolor='magenta') 
    ax.plot(t,1*np.cos(1*t+(np.pi/4)),'b-.h',label="y(t,1,1,$\pi$/4", markevery=10, markeredgecolor='red', markerfacecolor='green')
    ax.legend() 
    fig.tight_layout() 
    fig.savefig("SinusoidalPlots.eps") 
  
    
  
    
  
    
if __name__=="__main__": 
    print(y( 0,1,1,0)) 
    
    
    