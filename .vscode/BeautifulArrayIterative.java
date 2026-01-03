import java.util.ArrayList;

public class BeautifulArrayIterative {

    public static ArrayList<Integer> beautifulArray(int n) {

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);   // base case

        for (int i = 2; i <= n; i++) {

            ArrayList<Integer> temp = new ArrayList<>();

            // pehle EVEN values
            for (int j = 0; j < ans.size(); j++) {
                int e = ans.get(j);
                if (2 * e <= n) {
                    temp.add(2 * e);
                }
            }

            // phir ODD values
            for (int j = 0; j < ans.size(); j++) {
                int e = ans.get(j);
                if (2 * e - 1 <= n) {
                    temp.add(2 * e - 1);
                }
            }

            ans = temp;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(beautifulArray(5));
    }
}
