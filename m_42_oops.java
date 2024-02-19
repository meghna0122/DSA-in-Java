public class m_42_oops {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setname("Meghna");
        s1.setrollno(44);
        System.out.println(s1.name);
        System.out.println(s1.rollno);
        bankacc b1 = new bankacc();
        b1.username="Lucky";
        System.out.println(b1.username);
// cannot directly access password as it is private. 
//we can access private method using getters and setters.
b1.setpassword("1234");
System.out.println(b1.getpassword());

    }
}

class Student {
    String name;
    int rollno;

    void setname(String newname) {
        name = newname;
    }

    void setrollno(int newnumber) {
        rollno = newnumber;
    }
}

class bankacc {
    public String username;
    private String password;
    //setter for private method to be accessed
    public void setpassword(String pwd){
        this.password=pwd;
    }
    //getter for private method to be accessed
    public String getpassword(){
        return this.password;
    }



}
