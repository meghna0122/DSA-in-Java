public class m_40_adding_two_binary {
    public static void main(String[] args) {
        StringBuilder res = new StringBuilder();
        String a="11";
        String b="1";
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0) sum += a.charAt(i--) - '0';
            if(j >= 0) sum += b.charAt(j--) - '0';
            carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);
        }
        if(carry != 0) res.append(carry);
        System.out.println( res.reverse().toString());
    }
}
