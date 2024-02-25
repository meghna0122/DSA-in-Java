public class m_50_oops_interface {
  
    //Interface is blueprint of class
    // It is used to implement multiple inheritance 
    // To achieve total abstraction..100% abstraction
    //all methods in interface are public and abstract and without implementation
    
    
    public static void main(String args[]){  
        Drawable d=new Rectangle();  
        d.draw();  
        System.out.println(Drawable.cube(3));  
        
    }}
    interface Drawable{  
        void draw();  
        static int cube(int x){return x*x*x;}  
        }  
        class Rectangle implements Drawable{  
        public void draw(){System.out.println("drawing rectangle");}  
        }  
          
        
    

