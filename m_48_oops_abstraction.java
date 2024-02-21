public class m_48_oops_abstraction {
    public static void main(String[] args) {
        // hiding unnecessary details and showing only important parts to user
        //It can be achieved by Abstract class or Interfaces
        //ABSTRACT CLASS:
        // - cannot create instance of abstract class
        // - can have abstract and non abstract methods
        // can have constructors
        horse hr = new horse();
        hr.eat();
        hr.walk();
        chicken ch =new chicken();
        ch.walk();
        // animal a =new animal() ; ..cannot create 
            
        
         
    }
}
abstract class animal{
void eat(){
    System.out.println("animal eats");
}        
abstract void walk();
}
class horse extends animal{
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class chicken extends animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}

