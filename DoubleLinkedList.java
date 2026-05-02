import java.util.*;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.prev=null;
        this.next=null;
    }
}

class DLL {
    Node head = null;
    Node tail = null;

    // Insert at end (Create)
    void create(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Display forward and reverse
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.println("Forward:");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println("\nReverse:");
        temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    // Insert at front
    void insertAtFront(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Insert at end
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Insert at position (1-based)
    void insertAtMiddle(int data, int pos) {
        if (pos == 1) {
            insertAtFront(data);
            return;
        }
        if(pos==size()){
            insertAtEnd(data);
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            insertAtEnd(data);
            return;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }
    int size(){
        Node temp=head;
        int s=0;
        while(temp!=null){
            s++;
            temp=temp.next;
        }
        System.out.println(s);
        return s;
        
    }

    // Delete at front
    void deleteAtFront() {
        if (head == null) return;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    // Delete at end
    void deleteAtEnd() {
        if (tail == null) return;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    // Delete at position (1-based)
    void deleteAtMiddle(int pos) {
        if (head == null) return;

        if (pos == 1) {
            deleteAtFront();
            return;
        }

        Node temp = head;
        for (int i = 1; i < pos && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) return;

        if (temp == tail) {
            deleteAtEnd();
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }
}

public class DoubleLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLL obj = new DLL();
        
        while (true) {
            System.out.println("""
            1. Create
            2. Display
            3. Insert at front
            4. Insert at end
            5. Insert at middle
            6. Delete at front
            7. Delete at end
            8. Delete at middle
            9. Exit
            10.size
            """);

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> {
                    System.out.print("Enter data: ");
                    obj.create(sc.nextInt());
                }
                case 2 -> obj.display();
                case 3 -> {
                    System.out.print("Enter data: ");
                    obj.insertAtFront(sc.nextInt());
                }
                case 4 -> {
                    System.out.print("Enter data: ");
                    obj.insertAtEnd(sc.nextInt());
                }
                case 5 -> {
                    System.out.print("Enter data: ");
                    int data = sc.nextInt();
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    obj.insertAtMiddle(data, pos);
                }
                case 6 -> obj.deleteAtFront();
                case 7 -> obj.deleteAtEnd();
                case 8 -> {
                    System.out.print("Enter position: ");
                    obj.deleteAtMiddle(sc.nextInt());
                }
                case 9 -> 
                    System.exit(0);
                case 10 ->{
                    obj.size();
                }
                default -> System.out.println("Invalid Choice");
            }
        }
    }
}
