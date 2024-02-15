public class m_25_printLargestString_lexicographicOrder {
    public static void main(String[] args) {
        String fruits[]={"Apple","banana","grapes"};
        String largest = fruits[0];
        for(int i=1;i<fruits.length;i++){
            // a=str1.compareTo(str2) 
            // if a =0 -->equal string
            // if a<0 -->negative value --> str1 <str2
            // if a>0 -->positive value -->str1>str2
            if(largest.compareToIgnoreCase(fruits[i])<0){
                largest = fruits[i];
            }
        }

        System.out.println(largest);
    }
}
