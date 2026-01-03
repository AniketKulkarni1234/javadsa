public class NumberToWords {

    static String[] words = {
        "zero", "one", "two", "three", "four",
        "five", "six", "seven", "eight", "nine"
    };

    public static void convertToWords(int n) {
        // base case
        if (n == 0) {
            return;
        }

        int digit = n % 10;

        // recursive call (pehle)
        convertToWords(n / 10);

        // kaam (baad me)
        System.out.print(words[digit] + " ");
    }

    public static void main(String[] args) {
        int num = 1947;
        convertToWords(num);
    }
}
