import java.util.*;

public class KeypadCombinations {

    static String[] keypad = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public static void main(String[] args) {
        String digits = "23";
        List<String> result = new ArrayList<>();

        if (digits.length() == 0) {
            System.out.println(result);
            return;
        }

        backtrack(digits, 0, "", result);
        System.out.println(result);
    }

    static void backtrack(String digits, int index, String current, List<String> result) {

        // base case
        if (index == digits.length()) {
            result.add(current);
            return;
        }

        int digit = digits.charAt(index) - '0';
        String letters = keypad[digit];

        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);

            // choose
            backtrack(digits, index + 1, current + ch, result);
            // unchoose → automatic (string immutable)
        }
    }
}
