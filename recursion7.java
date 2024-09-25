// Write a recursive function multiples(n, k) that prints the first k multiples of a given number n in ascending order.g
public class recursion7 {
    static void multiples(int n, int k) {
        if (k == 1) {
            System.out.println(n);  // Base case: print n when k == 1
            return;  // Exit the recursion
        }
        multiples(n, k - 1);  // Recursive call with k-1
        System.out.println(n * k);  // Print the current multiple
    }

    public static void main(String[] args) {
        multiples(10, 5);  // Prints multiples of 10 up to 10*5
    }
}
