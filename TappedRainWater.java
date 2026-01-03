public class TappedRainWater {

    public static int trappedwater(int height[]) {
        int n = height.length;

        int lefMaxBoundary[] = new int[n];
        int rightMaxBoundary[] = new int[n];

        // left max boundary
        lefMaxBoundary[0] = height[0];
        for (int i = 1; i < n; i++) {
            lefMaxBoundary[i] = Math.max(height[i], lefMaxBoundary[i - 1]);
        }

        // right max boundary
        rightMaxBoundary[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMaxBoundary[i] = Math.max(height[i], rightMaxBoundary[i + 1]);
        }

        int trappedwaters = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(lefMaxBoundary[i], rightMaxBoundary[i]);
            trappedwaters += waterlevel - height[i];
        }

        return trappedwaters;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedwater(height));
    }
}
