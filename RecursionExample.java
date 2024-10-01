
public class RecursionExample {
    static boolean findTarget(int[] array, int target, int index) {
        // Base case: If the index is out of bounds
        if (index >= array.length) {
            return false; // Target not found
        }
        // Check if the current element matches the target
        if (array[index] == target) {
            return true; // Target found
        }
        // Recursive call to the next index
        return findTarget(array, target, index + 1);
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int target = 90;
        // Calling the findTarget method with the starting index of 0
     boolean found = findTarget(array, target, 0);
        
        // Print the result
        if (found) {
            System.out.println("Target found!");
        } else {
            System.out.println("Target not found!");
        }
    }
}
