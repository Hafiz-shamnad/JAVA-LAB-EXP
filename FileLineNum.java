import java.util.*;
import java.io.*;
public class FileLineNum{
    public static void main(String[] args){
        int lineNum = 0;
        try{
            FileInputStream fis = new FileInputStream("test.txt");
            FileOutputStream fos = new FileOutputStream("output.txt");
            System.out.print(++lineNum+ " ");
            int c = fis.read();
            while(c != -1){
                System.out.print((char) c);
                fos.write(c);
                if((char)c == '\n'){
                   System.out.print(++lineNum + " ");
                }
                c = fis.read();
            }
            fos.close();
            fis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
