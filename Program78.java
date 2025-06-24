
public class Program78 {

    //   Merge Sort Using The Divide and Conquer Technique .
    // Divide function: recursively splits the array
    // time complexity of Merge sort is  :  O( n logn )
    public static void divide(int[] arr, int si, int ei) {
        if (si >= ei) {              // Base case — when segment has 0 or 1 element
            return;
        }

        int mid = si + (ei - si) / 2;  // Compute middle index
        divide(arr, si, mid);         // Sort left half
        divide(arr, mid + 1, ei);     // Sort right half
        conquer(arr, si, mid, ei);    // Merge sorted halves
    }

    // Conquer function: merges two sorted subarrays arr[si..mid] and arr[mid+1..ei]
    public static void conquer(int[] arr, int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        // Merge elements from both halves in sorted order
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        // Copy any remaining elements from left half
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        // Copy any remaining elements from right half
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        // Copy back the merged array to original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        divide(arr, 0, n - 1);

        //  print loop variable declaration
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
