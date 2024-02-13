import java.util.*;
import java.io.*;
public class FileWordCount {
    public static void main(String[] args){
        int lineNum=1;
        int words=1;
        int chars = 0;
        try{
            FileInputStream fis = new FileInputStream("test.txt");
            int c = fis.read();
            while(c != -1){
                System.out.print((char) c);
                if((char)c == '\n'){
                    lineNum++;
                }else if((char)c == ' '){
                    words++;
                }else{
                    chars++;
                }
                c = fis.read();
            }
            System.out.println("\nNo. of Lines : " + (lineNum+1));
            System.out.println("No. of Words : " + words);
            System.out.println("No. of charecters : " + chars);
            fis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
