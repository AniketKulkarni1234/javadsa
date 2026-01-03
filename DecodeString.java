
import java.util.*;

public class DecodeString {

    public static String decode(String s) {

        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        String curr = "";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // digit
            if (Character.isDigit(ch)) {
                count = count * 10 + (ch - '0');
            }

            // opening bracket
            else if (ch == '[') {
                countStack.push(count);
                stringStack.push(curr);
                count = 0;
                curr = "";
            }

            // closing bracket
            else if (ch == ']') {
                int times = countStack.pop();
                String prev = stringStack.pop();

                String temp = "";
                for (int j = 0; j < times; j++) {
                    temp += curr;
                }
                curr = prev + temp;
            }

            // letter
            else {
                curr += ch;
            }
        }

        return curr;
    }

    public static void main(String[] args) {
        System.out.println(decode("2[cv]"));        // cvcv
        System.out.println(decode("3[b2[v]]"));     // bvvbvvbvv
    }
}

