import java.util.Scanner;
public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to be checked : ");
        int digit = sc.nextInt() ,flag = 0;
        for (int i = 2; i < digit; i++) {
            if(digit % i == 0){
                flag++;
                break;
            }
        }
        if (flag == 1){
            System.out.println("Not a prime Number");
        }else{
            System.out.println("Is a Prime NUmber");
        }
    }
}
