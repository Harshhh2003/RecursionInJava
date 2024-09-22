//  printing decreasing number 
import java.util.Scanner;
public  class recursion2{
    public static void printdecreasing(int n ){
        if( n==1){
            System.out.println(n);
            return ;
        } 
        //  self work 
        System.out.println(n);
        printdecreasing(n-1);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of  n    :  ");
        int n = sc.nextInt(); printdecreasing(n);
       
    }
}