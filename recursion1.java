import java.util.Scanner;
public  class recursion1{
    static void printincreasing(int n ){
        if(n ==1){
            System.out.println(n);
            return ;
            //  assuming below code will run correctly  from 1 to n-1 last  number we will print by our own
            
        } printincreasing(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printincreasing(n);


        
    }
}