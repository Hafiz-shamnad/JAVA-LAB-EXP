import java.util.Scanner;

public class MatTrans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter number of colomns : ");
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        int[][] trans = new int[col][row];
        System.out.println("Enter the Elements : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("["+i+"]["+j+"] = ");
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Before Transpose");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println(" ");
        }
        System.out.println("After Transpose");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(mat[j][i] + "\t");
            }
            System.out.println(" ");
        }
    }
}
