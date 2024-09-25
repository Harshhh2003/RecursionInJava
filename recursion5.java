// given an integer find out the sum of its digits using" recursion
public class recursion5{
    static int sumofdigits(int n){
        // base case 
        if(n >=0 && n<=9){
            return n;
        }
       int smallans = sumofdigits(n/10);
       int ans = smallans + n%10;
       return ans ;

    }
    public static void main(String[] args) {
      System.out.println("the ans is   :   "   +   sumofdigits(22222));
        
    }
}