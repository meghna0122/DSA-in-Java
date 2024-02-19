public class m_43_oops_constructor {
    public static void main(String[] args) {
        Student s1 = new Student("meghna", 44);
        s1.marks[0] = 100;
        s1.marks[1] = 89;
        s1.marks[2] = 90;
        Student s2 = new Student(s1); // copied s1
        s2.password = 123;
        s1.marks[2]=100;  // now changing s1 marks...marks of s2 should be changed or not? 
        // System.out.println(s2.name);
        // System.out.println(s2.rollno);
        // System.out.println(s2.password);
        for (int i = 0; i < 3; i++) {
            System.out.print(s2.marks[i]+" ");
        }

        // s2 gets changed bcs marks is an array and we copied the reference of the array not the values of the array.
        //s2 does not create a new array , it only refers to same array as that of s1.
// Hence this is called shallow copy: in which changes reflect 
//In deep copy: changes don't reflect and new array is formed in it
    }
}

class Student {
    String name;
    int rollno;
    int password;
    int marks[];
    // we can make multiple constructors also

    // parameterized constructor
    Student(String name, int roll) {
        this.name = name;
        this.rollno = roll;
        marks = new int[3];
    }

    // non parameterized constructor
    Student() {
        System.out.println("constructer is called");
        marks = new int[3];
    }

    // copy constructor...shallow copy
    Student(Student s1) {
        marks=new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        this.marks = s1.marks;
    }

    // copy constructor...deep copy
    // Student(Student s1) {
    //     marks=new int[3];
    //     this.name = s1.name;
    //     this.rollno = s1.rollno;
    //     for(int i=0;i<marks.length;i++){
    //         this.marks[i]=s1.marks[i];
    //     }
    // }
}
