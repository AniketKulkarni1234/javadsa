public class MajorityElement {

    public static int majorityElement(int[] nums) {
        return majorityRec(nums, 0, nums.length - 1);
    }

    // Recursive function
    public static int majorityRec(int[] nums, int low, int high) {

        // Base case: single element
        if (low == high) {
            return nums[low];
        }

        int mid = low + (high - low) / 2;

        int leftMajor = majorityRec(nums, low, mid);
        int rightMajor = majorityRec(nums, mid + 1, high);

        // If both halves agree
        if (leftMajor == rightMajor) {
            return leftMajor;
        }

        // Count occurrences
        int leftCount = count(nums, leftMajor, low, high);
        int rightCount = count(nums, rightMajor, low, high);

        return leftCount > rightCount ? leftMajor : rightMajor;
    }

    // Count frequency
    public static int count(int[] nums, int target, int low, int high) {
        int cnt = 0;
        for (int i = low; i <= high; i++) {
            if (nums[i] == target) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(majorityElement(nums));
    }
}
