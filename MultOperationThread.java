import java.util.Random;

class NumGen extends Thread{
    numSquare ns;
    numCube nc;
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Random rn = new Random();
                int randomnum = rn.nextInt(10);
                sleep(1000);
                if(randomnum % 2 == 0 )
                    new numSquare(randomnum);
                else
                    new numCube(randomnum);

            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

class numSquare extends Thread{
    numSquare(int num){
        System.out.println("Number is : "+num);
        System.out.println("Square is : "+ num*num);
    }
}
class numCube extends Thread{
    numCube(int num){
        System.out.println("Number is : "+num);
        System.out.println("Cube is : "+ num*num*num);
    }
}



public class MultOperationThread {
        public static void main(String[] args) {
            NumGen ng = new NumGen();
            ng.start();
        }
}
