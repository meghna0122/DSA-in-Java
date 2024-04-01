import java.util.Stack;

public class m_142_Practise_leetcode_valid_parenthesis_string {

    public static boolean checkValidString(String s) {
        int i = 0;
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while (i < s.length()) {
            char a = s.charAt(i);
            if (a == '(') {
                s1.push(i);
            } else if (a == '*') {
                s2.push(i);
            } else {

                if (!s1.isEmpty()) {
                    s1.pop();
                } else {
                    if (!s2.isEmpty()) {
                        s2.pop();
                    } else {
                        return false;
                    }
                }

            }

            i++;

        }
        while (!s1.isEmpty() && !s2.isEmpty()) {
            if (s1.pop() > s2.pop()) {
                return false;
            }

        }

        return s1.isEmpty();
    }

    public static void main(String[] args) {
        String s = "((**";
        boolean a = checkValidString(s);
        System.out.println(a);
    }
}
