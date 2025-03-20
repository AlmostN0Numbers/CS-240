import java.io.*;
class BestSorter {
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    // The result will be stored in arr[l..r]
    // Assume subarrays are sorted
    static void merge(BestInt arr[], int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;
        // Temp arrays
        BestInt[] left = new BestInt[n1];
        BestInt[] right = new BestInt[n2];
        // Copy data to temp arrays
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[m + 1 + j];
        }
        // Merge the temp arrays
        int i = 0, j = 0; // Initial indexes of first and second subarrays
        int k = l; // Initial index of merged subarray
        while (i < n1 && j < n2) {
            if (left[i].compareTo(right[j]) <= 0) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        // Copy remaining elements of left[], if any
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        // Copy remaining elements of right[], if any
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
    // function that sorts arr[l..r] using merge()
    static void sort(BestInt arr[], int l, int r)
    {
        if (l < r) {

            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    // A utility function to print array of size n
    static void printArray(BestInt arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i].bint + " ");
        System.out.println();
    }

    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        // we wish to implement a custom type
        BestInt[] marr = new BestInt[arr.length];
        for (int i=0; i < arr.length; i++) {
            marr[i] = new BestInt(arr[i]);
        }

        System.out.println("Given array is");
        printArray(marr);

        sort(marr, 0, marr.length - 1);

        System.out.println("\nSorted array is");
        printArray(marr);
    }
}