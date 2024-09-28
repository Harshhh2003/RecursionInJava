public class recursion12 { 
    static int minvalue(int[] array, int index) {
        if (index >= array.length - 1) {
            return array[index];
        } else {
            return Math.min(array[index], minvalue(array, index + 1));
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 21, 9, 2};
        int min = minvalue(array, 0);  // Directly calling minvalue
        System.out.println("Minimum value is: " + min);
    }
}
