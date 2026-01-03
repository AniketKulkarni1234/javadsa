import java.util.ArrayDeque;
import java.util.Deque;

public class MaxOfSubarrays {

    public static void printMax(int[] arr, int k) {
        int n = arr.length;
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            // 1️⃣ Remove elements which are out of this window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.removeFirst();
            }

            // 2️⃣ Remove smaller elements from back
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.removeLast();
            }

            // 3️⃣ Add current index
            dq.addLast(i);

            // 4️⃣ Print max of window
            if (i >= k - 1) {
                System.out.print(arr[dq.peekFirst()] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;

        printMax(arr, k);
    }
}
