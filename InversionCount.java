public class InversionCount {

    public static long inversionCount(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    // Merge Sort with inversion count
    public static long mergeSort(int[] arr, int si, int ei) {

        if (si >= ei) {
            return 0;
        }

        int mid = si + (ei - si) / 2;

        long count = 0;

        // Divide
        count += mergeSort(arr, si, mid);
        count += mergeSort(arr, mid + 1, ei);

        // Conquer (merge + count)
        count += merge(arr, si, mid, ei);

        return count;
    }

    // Merge and count inversions
    public static long merge(int[] arr, int si, int mid, int ei) {

        int[] temp = new int[ei - si + 1];
        int i = si;        // left pointer
        int j = mid + 1;   // right pointer
        int k = 0;

        long invCount = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += (mid - i + 1); // ⭐ key line
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy back
        for (int x = 0, y = si; x < temp.length; x++, y++) {
            arr[y] = temp[x];
        }

        return invCount;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        System.out.println(inversionCount(arr));
    }
}
