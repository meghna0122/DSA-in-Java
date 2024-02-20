public class m_45_oops_inheritance {
    public static void main(String[] args) {
        //Inheritance: it is when properties and methods of base class are 
        //passed on to a derived class
//SINGLE LEVEL INHERITANCE
     Mammal mn =new Mammal();
     mn.breathe();
//MULTI LEVEL INHERITANCE
     dog tonny =new dog();
     tonny.eat();
//HIERARCHIAL INHERITANCE --> fish and mammal are derived class of same base class i.e Animal class
//HYBRID INHERITANCE-->combination of all 
//MULTIPLE INHERITANCE is NOT implemented in JAVA
    }
}
//base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
//derived class
class Mammal extends Animal{
int legs;
void walk(){
    System.out.println("walk on ground");
}
}
class dog extends Mammal{
    String breed;
}
class fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swim in water");
    }

}

