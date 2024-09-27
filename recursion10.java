public class recursion10 {
    static void arrayprint(int[] array, int index) {
        if(index == array.length) {
            return ;
        }
        System.out.println(array[index]);
        arrayprint(array, index + 1); // Recursively calling the function
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};
        arrayprint(array, 0); // Starting from index 0
    }
}
