public class Subarrays {

    public static void subarray(int number[]) {
        int currSum;
        int maxSum = Integer.MIN_VALUE;

        // Step 1: Create Prefix Array
        int prefix[] = new int[number.length];
        prefix[0] = number[0];

        for (int i = 1; i < number.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];
        }

        // Step 2: Use prefix sum to find subarray sum
        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {

                // Subarray sum from i to j
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Max Sum using Prefix = " + maxSum);
    }

    public static void kadane(int number[]) {
        int cs = 0;  // current sum must start at 0
        int ms = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            cs = cs + number[i];

            if (cs < 0) {
                cs = 0;
            }

            ms = Math.max(ms, cs);
        }

        System.out.println("Max Sum using Kadane = " + ms);
    }

    public static void main(String args[]) {
        int number[] = { 2, 4, 6, 8, 10 };

        subarray(number);
        kadane(number);
    }
}
