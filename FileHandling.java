import java.util.*;
import java.io.*;
public class FileHandling {
    public static void main(String[] args){
        try{
            FileInputStream fi = new FileInputStream("test.txt");
            FileOutputStream fo = new FileOutputStream("output.txt");
            int c = fi.read();
            while(c != -1){
                System.out.print((char) c);
                fo.write(c);
                c = fi.read();
            }
            fo.close();
            fi.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
