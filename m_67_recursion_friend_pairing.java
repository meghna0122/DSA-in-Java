public class m_67_recursion_friend_pairing {
    public static int friendPair(int n){
        if(n==1 || n==2){
            return n;
        }
        int fn1=friendPair(n-1);
        int fn2 =friendPair(n-2);
        int pair= (n-1)* fn2;
        int totalways=fn1+pair;
        return totalways;

    }
public static void main(String[] args) {
    System.out.println(friendPair(4));
}
    
} 