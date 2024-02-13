import java.util.*;
class Sorter{
    void bubbleSort(int[] arr,int limit){
        for (int i = 0; i < limit ; i++) {
            for (int j = 0; j < limit - i -1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Second Smallest Element is : " + arr[1]);
    }
}

public class SecondSmallFinder {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Sorter sr = new Sorter();
        System.out.println("Enter number of elements : ");
        int limit = sc.nextInt();
        int[] arr = new int[limit];
        System.out.println("Enter the Elements : ");
        for (int i = 0; i < limit; i++) {
                arr[i] = sc.nextInt();
            }
        sr.bubbleSort(arr,limit);
        }
    }

