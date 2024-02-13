
class Pattern{
    synchronized void printPattern(int num){
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}

class PrintNum1 extends Thread{
    Pattern pn;
    PrintNum1(Pattern pn){
        this.pn = pn;
    }
    @Override
    public void run() {
        pn.printPattern(1);
    }
}
class PrintNum2 extends Thread{
    Pattern pn;
    PrintNum2(Pattern pn){
        this.pn = pn;
    }
    @Override
    public void run() {
        pn.printPattern(2);
    }
}

public class SyncThread {
    public static void main(String[] args) {
        Pattern pn = new Pattern();
        PrintNum1 p1 = new PrintNum1(pn);
        PrintNum2 p2 = new PrintNum2(pn);
        p1.start();
        p2.start();
    }
}
