public class m_46_oops_Polymorphism {
    public static void main(String[] args) {
        //polymorphism means:many forms
        //Two type: compile time polymorphism-->Method overloading
        //          Run time polymorphism    --> Method overriding
        //METHOD OVERLOADING-->Multiple functions with same name but differnt parameters
calculator cl =new calculator();
System.out.println(cl.sum(1,2));
System.out.println(cl.sum((float)2.0,(float)9.0)); // 6.0 is bydeafault taken as double in java , hence we need to typecast it in float
System.out.println(cl.sum(1,2,3));
    }
}

class calculator{
    int sum(int a ,int b){
        return a+b;
    }
    float sum(float a ,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}

