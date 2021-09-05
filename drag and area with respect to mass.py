# -*- coding: utf-8 -*-
"""
I understand and have adhered to all the tenets of the Duke
  Community Standard in completing every part of this assignment.  I
  understand that a violation of any part of the Standard on any part
  of this assignment can result in failure of this assignment, failure
  of this course, and/or suspension from Duke University.
""" 
import numpy as np 
import matplotlib.pyplot as plt 
A=([0.455	,0.402	,0.452	,0.486	,0.531	,0.475	,0.487]) 
C_D=([1.1461,1.1324,1.0952,1.0747,1.0672,1.0747,1.1316])  
m=([83.6	,60.2	,72.1	,91.1	,92.9	,65.3	,80.9])
# Set up figure and axis
fig,ax = plt.subplots(2,1,num=1, clear=True)
# Plot using red circles
ax[0].plot(m, A, 'gs-', label='Area versus m')
ax[1].plot(m, C_D, 'bs-', label='Drag constant versus m')
# Set labels and turn grid on
ax[0].set(xlabel='mass $t$, kg', ylabel='Area', title='Area vs mass') 
ax[1].set(xlabel='mass $t$, kg', ylabel='Drag constant', title=' drag constant vs mass')
# Use space most effectively
fig.tight_layout()
# Save as a PNG file
fig.savefig('Example2.png')

1.1461,1.1324,1.0952,1.0747,1.0672,1.0747,1.1316