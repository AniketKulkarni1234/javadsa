import java.util.ArrayList;
import java.util.Arrays;

public class mostfreqno {

    public static int countfreq(ArrayList<Integer> nums, int key) {

        int maxCount = 0;
        int result = 0;

        for (int i = 0; i < nums.size() - 1; i++) {

            if (nums.get(i) == key) {

                int target = nums.get(i + 1);
                int count = 0;

                // target ki frequency count karo
                for (int j = 0; j < nums.size() - 1; j++) {
                    if (nums.get(j) == key && nums.get(j + 1) == target) {
                        count++;
                    }
                }

                // max update
                if (count > maxCount) {
                    maxCount = count;
                    result = target;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums =
                new ArrayList<>(Arrays.asList(2,2,2,2,3));

        System.out.println(countfreq(nums, 2)); // output: 2
    }
}
