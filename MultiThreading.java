import java.util.*;

class OddPrinter extends Thread{
    @Override
    public void run() {
        try{
            for (int i = 1; i < 20; i+=2) {
                System.out.println(i);
                sleep(3000);
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
}

class EvenPrinter extends Thread{
    public void run() {
        try{
            for (int i = 2; i < 20; i+=2) {
                System.out.println(i);
                sleep(3000);
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        OddPrinter od = new OddPrinter();
        EvenPrinter ev = new EvenPrinter();
        od.start();
        ev.start();
    }
}
