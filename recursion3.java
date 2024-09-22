//  factorial of a number using recursion
public class recursion3{
    static int factorial(int n){
        //  base case
        if(n ==0){
            return 1;

        }
        //  recursive work
        int smallans = factorial(n-1);
        //  self work
       int ans = n     *  smallans;
        return ans;
    }
    public static void main(String[] args) {
         int result =factorial(6);
         System.out.println(result);
        
    }
}