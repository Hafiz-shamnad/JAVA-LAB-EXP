import java.util.Scanner;

public class MethOverloading {
    public static void area(int side){
        System.out.println("Area of Square is : " + side * side);
    }

    public static void area(int length, int breadth){
        System.out.println("Area of Rectangle is : " + length * breadth);
    }

    public static void area(int height, int base, double half){
        System.out.println("Area of Triangle is : " + height * base * half);
    }

    public static void area(int radius, double pi){
        System.out.println("Area of Circle is : " + radius * radius * pi);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        do {

            System.out.println("\nSelect shape to calculate area:");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("4. Circle");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter side length of the square: ");
                    int side = sc.nextInt();
                    area(side);
                    break;
                case 2:
                    System.out.print("Enter length of the rectangle: ");
                    int length = sc.nextInt();
                    System.out.print("Enter breadth of the rectangle: ");
                    int breadth = sc.nextInt();
                    area(length, breadth);
                    break;
                case 3:
                    System.out.print("Enter height of the triangle: ");
                    int height = sc.nextInt();
                    System.out.print("Enter base of the triangle: ");
                    int base = sc.nextInt();
                    area(height, base, 0.5);
                    break;
                case 4:
                    System.out.print("Enter radius of the circle: ");
                    int radius = sc.nextInt();
                    area(radius, 3.14);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        } while (choice != 0);
    }
}
