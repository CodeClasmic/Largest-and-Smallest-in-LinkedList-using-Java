import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void findLargestAndSmallest() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        int largest = head.data;
        int smallest = head.data;
        Node temp = head.next;
        while (temp != null) {
            if (temp.data > largest) {
                largest = temp.data;
            }
            if (temp.data < smallest) {
                smallest = temp.data;
            }
            temp = temp.next;
        }
        
        System.out.println("Largest node value: " + largest);
        System.out.println("Smallest node value: " + smallest);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();

        System.out.print("Enter the size of the linked list: ");
        int size = scanner.nextInt();

        System.out.println("Enter the elements of the linked list:");
        for (int i = 0; i < size; i++) {
            int value = scanner.nextInt();
            list.insert(value);
        }

        System.out.println("Finding largest and smallest node values...");
        list.findLargestAndSmallest();

        scanner.close();
    }
}
