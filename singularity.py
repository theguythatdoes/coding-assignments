import numpy as np
import matplotlib.pyplot as plt

def singularity(x, a, n):
    return (x > a) * ((x - a) ** n) 



def u(x): 
   g=((-1*(5/6)*(singularity(x,0,4)-singularity(x,5,4)))+((5/2)*singularity(x,8,3))+((325/2)*singularity(x,7,2))+((79/12)*x**3-((76/3)*x)))
   return g
if __name__ == "__main__": 
    x = np.linspace(0, 10, 100) 
    g=u(x)
    fig = plt.figure(num=1, clear=True)
    ax = fig.add_subplot(1, 1, 1)
    ax.plot(x,g,"k-")
    ax.set(title="Beam diflection vs beam length (rb382)", 
           xlabel="Beam length(ft)",
           ylabel="Diflection")
    ax.grid(True)
    fig.tight_layout()
    fig.savefig("SingPlots.eps") 
    
     
    
    
f=np.linspace(0,10,1000000) 
y=u(f) 
    
y_min= min(y) 
f_min=f[np.where(y==y_min)]
print(f_min,y_min) 
    
y_max= max(y) 
f_max=f[np.where(y==y_max)]
print(f_max,y_max)