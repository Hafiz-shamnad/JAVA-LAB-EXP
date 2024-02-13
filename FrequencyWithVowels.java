import java.util.Scanner;
public class FrequencyWithVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = sc.nextLine();
        int vowels = 0;
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
        for(int i = 0 ; i < word.length() ; i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                vowels++;
            }
        }
        int consonants = word.length()-vowels;
        System.out.println("Number of consonants = " + consonants);
        System.out.println("Number of vowels = " + vowels);
    }
}
