public class m_53_oops_static_keyword {
    public static void main(String[] args) {
    
        // main function is static beacuse we want main function should only be one. 
        //beacuse of static keyword ..multiple creations does not occur in memory.
        //for example: space for schoolname in memory is created only once .
        student s1=new student();
        s1.schoolname ="svps";
        student s2 =new student();
        System.out.println(s2.schoolname);
        student s3=new student();
        s3.schoolname ="llm";
        System.out.println(s2.schoolname);

    }
}
class student{
    String name;
    int roll;

    static String schoolname;

}