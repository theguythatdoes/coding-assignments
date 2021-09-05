# -*- coding: utf-8 -*-
"""
Created on Thu Sep 24 22:42:25 2020

@author: reube
"""

import matplotlib.pyplot as plt
import numpy as np
# Data 
t = np.linspace(0, 2*np.pi, 101)
x1 = 1 + 2 * np.cos(t)
x2 = 2 + 1 * np.sin(t)
# Set up figure and axis
fig = plt.figure(num=1, clear=True)
ax = fig.add_subplot(1, 1, 1)
# Plot using red circles
ax.plot(t, x1, 'gs-', label='First Line', markevery=10)
ax.plot(t, x2, 'bd:', label='Second Line', markevery=20)
# Set labels and turn grid on
ax.set(xlabel='Time $t$, sec', ylabel=r'Value $\xi$, m', title='Two Lines')
ax.grid(True)
ax.legend(loc='best')
# Use space most effectively
fig.tight_layout()
# Save as a PNG file
fig.savefig('Example2.png')