import java.util.Arrays;

public class practica4 {
    public static void main(String[] args) {
        int[] array = {2, 8, 0, 4, 2, 0, 0, 4};

        // toString
        System.out.println("Original array: " + Arrays.toString(array));

        // Sort
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        // Binary Search
        int index = Arrays.binarySearch(array, 7);
        System.out.println("Index of 7: " + index);

        // Equals
        int[] anotherArray = {0, 4, 0, 4, 2, 0, 2, 0};
        System.out.println("Arrays are equal: " + Arrays.equals(array, anotherArray));

        // Compare
        System.out.println("Comparison result: " + Arrays.compare(array, anotherArray));
    }
}
