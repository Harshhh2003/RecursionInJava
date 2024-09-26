//  finding gcd using recursion
import java.util.Scanner;
public class recursion9{
    static int gcd(int x , int y){ while ( x%y !=0){
        int rem =  x%y;
        x = y;
         y = rem;

    } return y;

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x   :   ");
        int x = sc.nextInt();      
         System.out.println("enter the value of y  :  "); 
        
        int y = sc.nextInt();
        System.out.println(" ans is    : "   + gcd(x, y));
        
    }
}