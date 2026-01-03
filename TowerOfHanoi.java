public class TowerOfHanoi {

    public static void toh(int n, char src, char helper, char dest) {

        // base case
        if (n == 1) {
            System.out.println("Shift disk 1 from '" + src + "' to '" + dest + "'");
            return;
        }

        // Step 1: move n-1 disks to helper
        toh(n - 1, src, dest, helper);

        // Step 2: move nth disk to destination
        System.out.println("Shift disk " + n + " from '" + src + "' to '" + dest + "'");

        // Step 3: move n-1 disks from helper to destination
        toh(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 3;   // number of disks
        toh(n, 'A', 'B', 'C');
    }
}
