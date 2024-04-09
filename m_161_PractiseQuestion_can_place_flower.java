public class m_161_PractiseQuestion_can_place_flower {
    public  static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0){
            return true;
        }
        
        if(flowerbed.length ==1){
           if( flowerbed[0]==0 && n==1){
        return true;
           }else{
            return false;
           }
        }
                for( int i=0;i<flowerbed.length;i++){
                    if(flowerbed[i]==0 ){
        if(flowerbed[1]==0 && i==0){
                n=n-1;
                flowerbed[0]=1;
                if(n==0){
                    return true;
                }
            }
        
              if(i==flowerbed.length-1 && flowerbed[flowerbed.length-2] ==0){
                n=n-1;
                flowerbed[flowerbed.length-1]=1;
                if(n==0){
                    return true;
                }
            }
        
        
                        if(i!=0 && i!=flowerbed.length-1 && flowerbed[i-1]!=1 && flowerbed[i+1]!=1 ){
                            n=n-1;
                            flowerbed[i]=1;
                            if(n==0){
                                return true;
                            }
                        }
                       }
                   
        
                
            }
        
            
        
          
            return false;
        }

        public static void main(String[] args) {
            int flowerbed[]={1,0,0,0,1};
            int n=1;
            boolean a=canPlaceFlowers(flowerbed,n);
            System.out.println(a);
        }
}
