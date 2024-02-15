public class m_31_remove_duplicate_in_string {
    public static void main(String[] args) {
        String str = "aabc";
        boolean array[] = new boolean[26];
        int ans=0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(!array[c-'a']){
                ans++;
                array[c-'a'] = true;
            }


        }
        System.out.println(ans);
    }
}
