package Data_Structure;

public class SimpleMergeSort {

    // Method to sort an array using merge sort
    public void sort(int[] array) {
        if (array.length < 2) {
            return; // Base case: array is already sorted
        }

        int mid = array.length / 2; // Find the middle index
        int[] left = new int[mid]; // Left subarray
        int[] right = new int[array.length - mid]; // Right subarray

        // Copy data to left and right subarrays
        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        // Recursive calls to sort both halves
        sort(left);
        sort(right);

        // Merge the sorted halves
        merge(array, left, right);
    }

    // Method to merge two sorted subarrays
    private void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merge until one of the subarrays is exhausted
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Copy remaining elements from left, if any
        while (i < left.length) {
            array[k++] = left[i++];
        }

        // Copy remaining elements from right, if any
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    // Main method to test the Merge Sort
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        SimpleMergeSort mergeSort = new SimpleMergeSort();
        int[] array = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Original array:");
        printArray(array);

        mergeSort.sort(array);

        System.out.println("Sorted array:");
        printArray(array);
    }

    // Helper method to print an array
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

