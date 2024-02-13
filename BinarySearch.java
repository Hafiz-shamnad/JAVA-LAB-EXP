import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int lower = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Limit of Numbers");
        int limit = sc.nextInt();
        int upper =limit;
        int[] arr = new int[limit];
        System.out.println("Enter the elements in ascending order");
        for (int i = 0; i < limit; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the item to be searched");
        int item = sc.nextInt();
        while(lower < upper) {
            int mid = lower + (upper - lower) / 2;
            if (arr[mid] == item) {
                System.out.println("Found at : " + mid);
                return;
            } else if (arr[mid] < item) {
                lower = mid + 1;
            } else {
                upper = mid - 1;
            }
        }
        System.out.println("Cannot Found the item");
    }
}
