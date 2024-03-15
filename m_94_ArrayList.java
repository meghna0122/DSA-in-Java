import java.util.ArrayList;

public class m_94_ArrayList {

    public static void reverse(ArrayList<Integer> list){
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }

    public static void MaxElement(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        // for (int i = 0; i < list.size(); i++) {
        //     int a =list.get(i);
        //     if(a>max){
        //         max=a;
        //     }
        // }
        for (int i = 0; i < list.size(); i++) {
            max=Math.max(max, list.get(i));
        }
        System.out.println(max);
    }

    public static void Swap(ArrayList<Integer> list , int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2, temp);
        System.out.println(list);

    }
    public static void main(String[] args) {
        // dynamic inbuild data structure in java
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);// O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // System.out.println(list);
        // list.remove(4);
        // // System.out.println(list);
        // // System.out.println(list.get(0));
        // list.set(0,10);
        // // System.out.println(list);
        // list.add(0,20);
        // // System.out.println( list.contains(20));
        // System.out.println(list.size());
        reverse(list);
        MaxElement(list);
        Swap(list,1,2);

    }
}
