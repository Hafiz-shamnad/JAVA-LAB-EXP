import java.util.Scanner;

abstract class Areafinder{
    Scanner sc = new Scanner(System.in);
    double half = 0.5 , pi = 3.14;
    abstract void area();
}
class Rectangle extends Areafinder{
    public void area(){
        System.out.print("Enter length of the rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of the rectangle: ");
        int breadth = sc.nextInt();
        System.out.println("Area of Rectangle is : " + length * breadth);
    }
}
class Square extends Areafinder{
    public void area(){
        System.out.print("Enter side length of the square: ");
        int side = sc.nextInt();
        System.out.println("Area of Square is : " + side * side);
    }
}
class Triangle extends Areafinder{
    public void area(){
        System.out.print("Enter height of the triangle: ");
        int height = sc.nextInt();
        System.out.print("Enter base of the triangle: ");
        int base = sc.nextInt();
        System.out.println("Area of Triangle is : " + height * base * half);
    }
}
class Circle extends Areafinder{
    public void area(){
        System.out.print("Enter radius of the circle: ");
        int radius = sc.nextInt();
        System.out.println("Area of Circle is : " + radius * radius * pi);
    }
}
public class OverridingAbstraction{

    public static void main(String[] args) {
        Square sq = new Square();
        Rectangle rc = new Rectangle();
        Triangle tri = new Triangle();
        Circle ci = new Circle();
        int choice;
        do {

            System.out.println("\nSelect shape to calculate area:");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("4. Circle");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                   sq.area();
                    break;
                case 2:
                    rc.area();
                    break;
                case 3:
                    tri.area();
                    break;
                case 4:
                    ci.area();
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