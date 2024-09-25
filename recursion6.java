// given 2 numbers p and q find p^q using recursion 
public class recursion6{
    
    static int power(int p , int q){
        //  base work 
        if( q==0) return 1;

        return power(p, q-1) * p;
    }
    
    
    public static void main(String[] args) {
       System.out.println(power(2, 04));

        
    
}
}