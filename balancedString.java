public class balancedString {
    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";

        int count = 0;
        int countfinal = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'L') {
                count++;
            } else { // 'R'
                count--;
            }

            if (count == 0) {
                countfinal++;
            }
        }

        System.out.println(countfinal);
    }
}
