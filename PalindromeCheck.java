import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = sc.nextLine();
        String reversed = "";
        for(int i=word.length()-1 ; i>=0 ;i--) {
            reversed += word.charAt(i);
        }
        if(reversed.equals(word)){
            System.out.println("Is a palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
