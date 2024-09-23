
//  fibonacci number using recursion
public class recursion4{


    static int fibonacci(int n){
        if( n==1 || n==0){
            return n;
        }
        int previous1 = fibonacci(n-1);
        int previous2 = fibonacci(n-2);
        return previous1+ previous2;
    }
    
  
    
    public static void main(String[] args) {
        System.out.println(fibonacci( 7));
   



        
    }
}