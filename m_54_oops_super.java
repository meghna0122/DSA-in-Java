public class m_54_oops_super {
    public static void main(String[] args) {
        //super keyword is used to refer immediate parent class object.
        //it is used to access parents's properties
        //it is used to access parents's functions
        //used to access parents's constructor
horse h = new horse();
System.out.println(h.color);

    }
}

class animal{
    String color;
    animal(){
        System.out.println("animal constructor is called");
    }
}
class horse extends animal{
    horse(){
        super.color="brown";
        System.out.println("horse called");
    }
}
