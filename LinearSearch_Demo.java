package Data_Structure;
import java.util.*;
//Program for understanding logic of 
public class LinearSearch_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner s = new Scanner(System.in);
        
        // Taking input for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = s.nextInt();
        
        int[] array = new int[size];
        
        // Taking input for the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = s.nextInt();
        }
        
        // Taking input for the target value
        System.out.print("Enter the target value to search for: ");
        int target = s.nextInt();
        
        // Performing linear search
        int result = linearSearch(array, target);
        
        // Displaying the result
        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        // Closing the scanner
        s.close();
    }

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the index if the element is found
            }
        }
        return -1; // Return -1 if the element is not found
    }
}
