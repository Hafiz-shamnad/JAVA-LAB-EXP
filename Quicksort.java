import java.util.Scanner;

public class Quicksort {

    public static int partition(String[]arr,int low,int high){
        int i = low-1;
        String pivot = arr[high];

        for (int j = low; j <= high; j++) {
            if(arr[j].compareTo(pivot) < 0){
                i++;
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        String temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    public static void quicksort(String[]arr,int low,int high){
        if(low<high){
            int pivot_index = partition(arr, low, high);
            quicksort(arr,low,pivot_index-1);
            quicksort(arr,pivot_index+1,high);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Limit of Name");
        int limit = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[limit];
        System.out.println("Enter the Names : ");
        for (int i = 0; i < limit; i++) {
            arr[i] = sc.nextLine();
        }
        quicksort(arr,0,limit-1);
        for (int i = 0; i < limit; i++) {
            System.out.println(arr[i]);
        }
    }
}
