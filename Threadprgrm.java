import java.util.Random;

public class NumberGeneratorDemo {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        EvenPrinter evenPrinter = new EvenPrinter(generator);
        OddPrinter oddPrinter = new OddPrinter(generator);

        Thread generatorThread = new Thread(generator);
        Thread evenThread = new Thread(evenPrinter);
        Thread oddThread = new Thread(oddPrinter);

        generatorThread.start();
        evenThread.start();
        oddThread.start();
    }
}

class NumberGenerator extends Thread{
    public void run() {
        Random random = new Random();
            int randomNumber = random.nextInt(100) + 2; // Generate random number (>1)
            if (randomNumber % 2 == 0) { // If even
                EvenPrinter.printNumbers(randomNumber);
            } else { // If odd
                OddPrinter.printNumbers(randomNumber);
            }
            try {
                Thread.sleep(1000); // Wait for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}

class EvenPrinter implements Runnable {
    private static int number;

    public EvenPrinter(NumberGenerator generator) {
    }

    public static void printNumbers(int num) {
        number = num;
        for (int i = 2; i <= number; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void run() {
    }
}

class OddPrinter implements Runnable {
    private static int number;

    public OddPrinter(NumberGenerator generator) {
    }

    public static void printNumbers(int num) {
        number = num;
        for (int i = 1; i <= number; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void run() {
    }
}