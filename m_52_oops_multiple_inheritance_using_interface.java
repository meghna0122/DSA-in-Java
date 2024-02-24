public class m_52_oops_multiple_inheritance_using_interface {
    public static void main(String[] args) {
        bear b =new bear();
        b.eat_grass();
        b.eat_flesh();
    }
}

interface herbivore{
void eat_grass();
}
interface carnivor{
void eat_flesh();
}

class bear implements herbivore, carnivor{
    public void eat_grass(){
        System.out.println("eat grass");
}
public void eat_flesh(){
    System.out.println("eat flesh also");
}

}
