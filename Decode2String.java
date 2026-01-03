import java.util.*;

public class Decode2String {
    public String decodeString(String s) {

        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        int count = 0;
        StringBuilder curr = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                count = count * 10 + (ch - '0');
            }
            else if (ch == '[') {
                countStack.push(count);
                stringStack.push(curr);

                count = 0;
                curr = new StringBuilder();
            }
            else if (ch == ']') {
                int times = countStack.pop();
                StringBuilder prev = stringStack.pop();

                for (int j = 0; j < times; j++) {
                    prev.append(curr);
                }
                curr = prev;
            }
            else {
                curr.append(ch);
            }
        }
        return curr.toString();
    }
}
