public class m_74_recursion_move_all_x_to_end_of_string {
    
    public static void MoveX(String str,int i , StringBuilder s,int count){
        if(i==str.length()){
            for(i=0;i<count;i++){
                s.append('x');
            }
            s.toString();
System.out.println(s);
return;
        }

        if(str.charAt(i)=='x'){
count++;
MoveX(str, i+1, s, count);

        }
        else{
            s.append(str.charAt(i));
            MoveX(str, i+1, s, count);
        }


    }

  
    public static void main(String[] args) {
        String str="axbcxdxxe"; // output: abcdxxxx
        StringBuilder s =new StringBuilder("");
        MoveX(str, 0, s, 0);

    }
}
