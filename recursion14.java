import java.util.Scanner;
public class recursion14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String s =  "  harsh";
        String s = sc.nextLine();

        // System.out.println(s);
      
         char ch = s.charAt(2);
      
        System.out.println(ch);
        for(int i=0; i< s.length(); i++){

        System.out.println(s.charAt(i));
        System.out.println(s.substring(2));
       
    }}
}