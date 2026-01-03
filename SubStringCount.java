public class SubStringCount {

    public static int countSub(String s, int start, int end) {

        if (start == s.length()) {
            return 0;
        }

        if (end == s.length()) {
            return countSub(s, start + 1, start + 1);
        }

        int count = 0;
        if (s.charAt(start) == s.charAt(end)) {
            count = 1;
        }

        int nextCount = countSub(s, start, end + 1);
        return count + nextCount;
    }

    public static void main(String[] args) {
        String s = "abcab";
        System.out.println(countSub(s, 0, 0));
    }
}
