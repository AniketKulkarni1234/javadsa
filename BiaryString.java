public class BiaryString {

    public static void printBin(int n, int lastplace, String str) {
        if(n == 0) {
            System.out.println(str);
            return;
        }

        if(lastplace == 0) {
            // Place '0'
            printBin(n-1, 0, str + "0");
            // Place '1'
            printBin(n-1, 1, str + "1");
        } else {
            // lastplace = 1, so we cannot place another 1
            printBin(n-1, 0, str + "0");
        }
    }

    public static void main(String[] args) {
        printBin(3, 0, "");
    }
}
