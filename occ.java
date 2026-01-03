public class occ {

    public static void findOcc(int[] arr, int key, int idx) {
        // base case
        if (idx == arr.length) {
            return;
        }

        // kaam
        if (arr[idx] == key) {
            System.out.print(idx + " ");
        }

        // recursive call
        findOcc(arr, key, idx + 1);
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;

        findOcc(arr, key, 0);
    }
}
