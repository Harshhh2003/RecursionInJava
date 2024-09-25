import java.util.Scanner;
public class recursion8{
    static int seriessum2(int n){
        if (n==0) return 0;
        if( n%2==0){

            return seriessum2(n-1) -n;
            // for even no.
        } else{ 
            return seriessum2(n-1)+n;
            //  for odd no.
        }
    }
    static int seriessum(int n){
        if ( n==0) return 0;
       return seriessum(n-1)  + n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(seriessum2(6));
        
    }
}