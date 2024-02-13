import java.util.*;

import java.util.Scanner;

class Employee {
    void display(){
        System.out.println("Employee of RIET");
    }

    void salary(){
        System.out.println("The Salary of an Employee is 10000");
    }
}

class Engineer extends Employee {
    void salary(){
        System.out.println("The Salary of an Engineer is 50000");
    }
}

public class MethOverriding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Choose an option:");
            System.out.println("1. Display Employee information");
            System.out.println("2. Display Engineer information");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Employee employee = new Employee();
                    employee.display();
                    employee.salary();
                    break;
                case 2:
                    Engineer engineer = new Engineer();
                    engineer.display();
                    engineer.salary();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        } while (choice != 0);
        scanner.close();
    }
}

