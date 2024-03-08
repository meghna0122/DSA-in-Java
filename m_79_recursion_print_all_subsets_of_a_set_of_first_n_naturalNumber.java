import java.util.ArrayList;

public class m_79_recursion_print_all_subsets_of_a_set_of_first_n_naturalNumber {
    public static void print( ArrayList<Integer> subset){
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }

    public static void PrintSubset(int n , ArrayList<Integer> subset){
        if(n==0){
           print(subset);
           return;
        }
        subset.add(n);
        PrintSubset(n-1, subset);
        subset.remove(subset.size()-1);
        PrintSubset(n-1, subset);
    }
    public static void main(String[] args) {
        int n =3;
        ArrayList<Integer> subset = new ArrayList<>();
        PrintSubset(n, subset);
    }
}
