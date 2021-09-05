public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
    long init=0;
    for(int i=0;i<sizes.length; i++){
          if (sizes[i]%clusterSize==0){
              init=init+sizes[i];
        }
        
        else if (sizes[i]==0){
            init=init;

        }

        else{
            init=init+((sizes[i]/clusterSize)+1)*clusterSize;
        }
    }
    return init;

}

}
