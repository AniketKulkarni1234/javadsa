import java.util.*;

public class MergeSortStrings {

    // Merge Sort function
    public static void mergeSort(String[] arr, int si, int ei) {
        // Base case
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        // Divide
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);

        // Conquer (merge)
        merge(arr, si, mid, ei);
    }

    // Merge function
    public static void merge(String[] arr, int si, int mid, int ei) {
        String[] temp = new String[ei - si + 1];

        int i = si;       // left part
        int j = mid + 1;  // right part
        int k = 0;

        // Compare and merge
        while (i <= mid && j <= ei) {
            if (arr[i].compareTo(arr[j]) <= 0) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Remaining left elements
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Remaining right elements
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy back to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    // Driver code
    public static void main(String[] args) {
        String[] arr = { "sun", "earth", "mars", "mercury" };

        mergeSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
