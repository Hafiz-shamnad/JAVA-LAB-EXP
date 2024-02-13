import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = sc.nextLine();
        System.out.println("Character frequencies:");
        for(char ch = 'a' ; ch <= 'z' ; ch++){
            int count = 0 ;
            for(int i = 0 ; i < word.length() ; i++) {
                if (word.charAt(i) == ch) {
                    count++;
                }
            }
            if(count != 0){
                System.out.println(ch + " = " + count);
            }
        }
    }
}
