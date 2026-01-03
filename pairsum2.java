import java.util.ArrayList;

public class pairsum2 {

    public static boolean pairsSum2(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();

        // Find breaking point (where rotation happened)
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        int lp = (bp + 1) % n; // smallest element index
        int rp = bp;           // largest element index

        // Two pointer search in rotated sorted array
        while (lp != rp) {
            int sum = list.get(lp) + list.get(rp);

            if (sum == target) {
                return true;
            } else if (sum < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();

        height.add(11);
        height.add(15);
        height.add(6);
        height.add(8);
        height.add(9);
        height.add(10);

        int target = 16;

        System.out.println(pairsSum2(height, target)); 
    }
}
