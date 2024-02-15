public class m_28_StringCompression {
    public static void main(String[] args) {
        String str="abbccc";
        StringBuilder sb=new StringBuilder("");
        Integer count=1;
        for(int i=0;i<str.length()-1;i++){

            if(str.charAt(i)==str.charAt(i+1)){
               
                count++;
            }
            else{
              
                sb.append(str.charAt(i));
              if(count>1) { sb.append(count.toString());
                }
                count=1;
               
            }
        }
        sb.append(str.charAt(str.length()-1));
       
        sb.toString();
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
