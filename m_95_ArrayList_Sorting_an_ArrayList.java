import java.util.ArrayList;
import java.util.Collections;

public class m_95_ArrayList_Sorting_an_ArrayList {
    public static void main(String[] args) {
        // In array -->  Arrays.sort(arr) --> Arrays is a class and sort is the method of this class.
        //In arraylist --> Collections.sort()--> Collections is the class and sort is its method
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(5);
        //sort in ascending order
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        //sort in descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);


        
    }
}
