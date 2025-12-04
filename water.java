public class water {

    public static int TrapppedWater(int height[]) {
        int n = height.length;

        // calculate left max boundary
        int leftmaxbound[] = new int[n];
        leftmaxbound[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmaxbound[i] = Math.max(height[i], leftmaxbound[i - 1]);
        }

        // calculate right max boundary
        int rightmaxboundary[] = new int[n];
        rightmaxboundary[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmaxboundary[i] = Math.max(height[i], rightmaxboundary[i + 1]);
        }

        // calculate trapped water
        int TrapppedWaters = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftmaxbound[i], rightmaxboundary[i]);
            TrapppedWaters += waterlevel - height[i];
        }

        return TrapppedWaters;
    }

    public static void main(String args[]) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(TrapppedWater(height));
    }
}
