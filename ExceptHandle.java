import java.util.*;
public class ExceptHandle {
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        System.out.println("Enter the Dividend");
        int dividend = sc.nextInt();
        System.out.println("Enter the Divisor");
        int divisor = sc.nextInt();
        double res = 0;
        try{
            res = (double)dividend/divisor;
            System.out.println("Result : " + res); // produce result as infinity in updated versions of java
            if(divisor == 0){
                throw new ArithmeticException("Zero Division Founded") ;
            }
        }catch (ArithmeticException ae){
            System.out.println("Expection Triggered \n" + ae);
        }

    }
}
