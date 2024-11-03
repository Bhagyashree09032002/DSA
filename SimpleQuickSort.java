package Data_Structure;

public class SimpleQuickSort {

    // Method to perform Quick Sort
    public void sort(int[] array, int low, int high) {
        if (low < high) {
            // Get the pivot index
            int pivotIndex = partition(array, low, high);

            // Recursively sort the subarrays
            sort(array, low, pivotIndex - 1);  // Sort left part
            sort(array, pivotIndex + 1, high); // Sort right part
        }
    }

    // Method to partition the array
    private int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Choosing the last element as the pivot
        int i = low - 1; // Pointer for the smaller element

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) { // If current element is smaller than or equal to the pivot
                i++;
                swap(array, i, j); // Swap elements
            }
        }
        swap(array, i + 1, high); // Move the pivot to its correct position
        return i + 1; // Return the pivot index
    }

    // Method to swap two elements in the array
    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Main method to test Quick Sort
    public static void main(String[] args) {
        SimpleQuickSort quickSort = new SimpleQuickSort();
        int[] array = {90, 47, 23, 3, 9, 82, 10};

        System.out.println("Original array:");
        printArray(array);

        quickSort.sort(array, 0, array.length - 1); // Call the sort method

        System.out.println("Sorted array:");
        printArray(array);
    }

    // Helper method to print the array
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
