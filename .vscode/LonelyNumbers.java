import java.util.*;

public class LonelyNumbers {

    public static ArrayList<Integer> lonelyNum(ArrayList<Integer> nums) {
        Collections.sort(nums);
        ArrayList<Integer> ans = new ArrayList<>();

        int n = nums.size();

        for (int i = 0; i < n; i++) {
            boolean isLonely = true;

            // duplicate check
            if (i > 0 && nums.get(i).equals(nums.get(i - 1))) {
                isLonely = false;
            }
            if (i < n - 1 && nums.get(i).equals(nums.get(i + 1))) {
                isLonely = false;
            }

            // adjacent number check
            if (i > 0 && nums.get(i) == nums.get(i - 1) + 1) {
                isLonely = false;
            }
            if (i < n - 1 && nums.get(i) == nums.get(i + 1) - 1) {
                isLonely = false;
            }

            if (isLonely) {
                ans.add(nums.get(i));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(10, 6, 5, 8));
        System.out.println(lonelyNum(nums)); // [8, 10]
    }
}
