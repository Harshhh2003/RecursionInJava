public class recursion11 {
    public static int maxvalue(int[] array, int index) {
        if (index >= array.length - 1) {
            return array[index];
        } else {
            return Math.max(array[index], maxvalue(array, index + 1));
        }
    }

    public static void main(String[] args) {
        int[] array = {23, 70, 132, 21, 10};
        int max = maxvalue(array, 0); // Directly calling maxvalue
        System.out.println("Maximum value: " + max);
    }
}
