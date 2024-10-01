public class recursion13 {
   
    static int findTarget(int[] array, int target, int index) {
        // Base case: If the index is out of bounds
        if (index >= array.length) {
            return -1; // Target not found
        }
      
        if (array[index] == target) {
            return index; 
        }
     
        return findTarget(array, target, index + 1); 
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int target = 40;

       
        int index = findTarget(array, target, 0); // Store the result

        
        if (index != -1) { // If index is not -1, target is found
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found!");
        }
    }
}
