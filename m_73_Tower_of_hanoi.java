public class m_73_Tower_of_hanoi {
    public static void TOH(int n  , String s , String h, String d){
if(n==1){
    System.out.println("Disk transfered "+n+" from "+s+"to "+d);
    return;
}
TOH(n-1, s, d, h);
System.out.println("Disk transfered "+n+" from "+s+"to "+d);
TOH(n-1, h, s, d);
    }
    public static void main(String[] args) {
        TOH(3,"A","B","C");
    }
}
