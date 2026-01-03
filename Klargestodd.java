import java.util.*;

public class Klargestodd {
    public static void main(String[] args) {

        Integer arr[] = {-3, -2, -1, 0, 1, 2, 3};
        int k = 1; // Kth largest

        ArrayList<Integer> odd = new ArrayList<>();

        // Step 1: odd numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                odd.add(arr[i]);
            }
        }

        // Step 2: descending order
        Collections.sort(odd, Collections.reverseOrder());

        // Step 3: Kth largest
        if (k <= odd.size()) {
            System.out.println(odd.get(k - 1));
        } else {
            System.out.println("Invalid K");
        }
    }
}
