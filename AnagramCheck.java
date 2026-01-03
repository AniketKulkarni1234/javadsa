import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (isAnagram(str1, str2)) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Strings are NOT anagrams");
        }
    }

    public static boolean isAnagram(String s1, String s2) {
        // Step 1: check length
        if (s1.length() != s2.length()) {
            return false;
        }

        // Step 2: convert to char array
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        // Step 3: sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 4: compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }
}
