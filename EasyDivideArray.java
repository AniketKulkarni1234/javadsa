public class EasyDivideArray {

    // Easy logic: try every possible maximum sum
    public static int minMaxSubarraySum(int[] arr, int K) {

        int sumTotal = 0;
        int maxElement = arr[0];

        // 1️⃣ total sum aur maximum element nikal lo
        for (int i = 0; i < arr.length; i++) {
            sumTotal += arr[i];
            maxElement = Math.max(maxElement, arr[i]);
        }

        // 2️⃣ har possible maximum sum try karo
        for (int possibleMax = maxElement; possibleMax <= sumTotal; possibleMax++) {

            int currentSum = 0;
            int subarrays = 1;

            for (int i = 0; i < arr.length; i++) {

                if (currentSum + arr[i] > possibleMax) {
                    // naya subarray start
                    subarrays++;
                    currentSum = arr[i];
                } else {
                    currentSum += arr[i];
                }
            }

            // 3️⃣ agar K ya usse kam subarrays me ho gaya
            if (subarrays <= K) {
                return possibleMax;
            }
        }

        return sumTotal;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int K = 3;

        System.out.println("Minimum possible maximum subarray sum: "
                + minMaxSubarraySum(arr, K));
    }
}
