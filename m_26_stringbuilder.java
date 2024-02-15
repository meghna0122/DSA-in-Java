public class m_26_stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch= 'a';ch<='z';ch++){
sb.append(ch);
        }
//O(26)...i.e O(n);
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
