public class m_47_oops_overriding {
    public static void main(String[] args) {
        // parent and child both contain the same function with a different definition.
deer dr =new deer();
dr.eat();
Animal an = new Animal();
an.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("eat anything");
    }
}
class deer extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
}
