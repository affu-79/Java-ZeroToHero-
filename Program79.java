
public class Program79 {

    // Qick Sort
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        // Partioning process
        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] < pivot) {
                i++;// increment index of smaller element
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap 
        i++; // increment i here
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
        // return pivot index
    }

    public static void quickSort(int arr[], int low, int high) {
        // base case
        if (low < high) {
            int pivot = partition(arr, low, high); // pivot index
            quickSort(arr, low, pivot - 1); // sort elements before pivot 
            quickSort(arr, pivot + 1, high); // Recursive call

        }

    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;

        quickSort(arr, 0, n - 1);
        // print the array 
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
