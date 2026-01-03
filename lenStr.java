public class lenStr {

    public static int length(String str, int idx) {
        // base case
        if (idx == str.length()) {
            return 0;
        }

        // recursive relation
        return 1 + length(str, idx + 1);
    }

    public static void main(String[] args) {
        String str = "aniket";
        int ans = length(str, 0);
        System.out.println(ans);
    }
}
