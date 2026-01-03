import java.util.*;

public class StackTrappedWater {

    public static int trappedWater(int[] height) {
        Stack<Integer> st = new Stack<>();
        int water = 0;

        for (int i = 0; i < height.length; i++) {

            // right boundary mil gayi
            while (!st.isEmpty() && height[i] > height[st.peek()]) {

                int mid = st.pop();   // beech wali bar

                if (st.isEmpty())
                    break;           // left boundary nahi

                int left = st.peek();

                int width = i - left - 1;
                int h = Math.min(height[left], height[i]) - height[mid];

                water += width * h;
            }

            st.push(i); // possible left boundary
        }

        return water;
    }

    public static void main(String[] args) {
        int[] height = {7, 0, 4, 2, 5, 0, 6, 4, 0, 6};
        System.out.println("Trapped Water = " + trappedWater(height));
    }
}
