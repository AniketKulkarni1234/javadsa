import java.util.Arrays;

public class lexsmall {

    public static void lexo_small(int n, int k) {

        char[] arr = new char[n];
        Arrays.fill(arr, 'a');   // step 1

        int remain = k - n;      // step 2
        System.out.println("remain value = " + remain);

        int i = n - 1;           // end se start

        while (remain > 0 && i >= 0) {
            int add = Math.min(25, remain);
            arr[i] = (char) (arr[i] + add);
            remain -= add;
            i--;
        }

        System.out.println(arr);
    }

    public static void main(String[] args) {
        int n = 3, k = 25;
        lexo_small(n, k);
    }
}
