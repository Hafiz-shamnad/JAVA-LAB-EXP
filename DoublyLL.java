import java.util.Scanner;

class Node {
    int data;
    Node Llink;
    Node Rlink;

    Node(int data) {
        this.data = data;
        Llink = null;
        Rlink = null;
    }
}

public class DoublyLL {
    Node head = null;

    public void insert(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        } else {
            Node ptr = head;
            while (ptr.Rlink != null) {
                ptr = ptr.Rlink;
            }
            ptr.Rlink = newnode;
            newnode.Llink = ptr;
        }
    }

    public int delete() {
        if (head == null) {
            System.out.println("List is Empty Cannot Delete");
            return -1;
        } else {
            int deletedData = head.data;
            head = head.Rlink;
            if (head != null) {
                head.Llink = null;
            }
            return deletedData;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("Doubly Linked List is empty");
            return;
        }
        Node current = head;
        System.out.println("Doubly Linked List:");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.Rlink;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLL dll = new DoublyLL();
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert: ");
                    int data = scanner.nextInt();
                    dll.insert(data);
                    break;
                case 2:
                    int deletedData = dll.delete();
                    if (deletedData != -1) {
                        System.out.println("Deleted data: " + deletedData);
                    }
                    break;
                case 3:
                    dll.display();
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
