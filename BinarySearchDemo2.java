package Data_Structure;
import java.util.Scanner;
// Program for understanding logic of binary search.
public class BinarySearchDemo2 {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = s.nextInt();
        
        // Input elements of the array
        int[] array = new int[n];
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }

        // Input target value
        System.out.print("Enter the value to search for: ");
        int target = s.nextInt();

        // Perform binary search
        int result = binarySearch(array, target);

        // Output the result
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is present at mid
            if (array[mid] == target) {
                return mid;
            }
            // If target is greater, ignore left half
            if (array[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }

        // Target was not found
        return -1;
    }
}