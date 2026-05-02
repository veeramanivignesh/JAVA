import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CSLL {
    Node head = null;
    Node temp = null;

    // Create (insert at end)
    void create(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head;   
        } else {
            temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;   
        }
    }


    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }

    void insertAtFront(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }

        temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    void insertAtEnd(int data) {
        create(data);
    }

    void deleteAtFront() {
        if (head == null) return;

        if (head.next == head) {
            head = null;
            return;
        }

        temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        head = head.next;
        temp.next = head;
    }

    void deleteAtEnd() {
        if (head == null) return;

        if (head.next == head) {
            head = null;
            return;
        }

        temp = head;
        while (temp.next.next != head) {
            temp = temp.next;
        }

        temp.next = head;
    }

    void search(int num) {
        if (head == null) {
            System.out.println("Not found");
            return;
        }

        temp = head;
        do {
            if (temp.data == num) {
                System.out.println("Found!");
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("Not found");
    }

    void size() {
        if (head == null) {
            System.out.println("Size = 0");
            return;
        }

        int count = 0;
        temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Size = " + count);
    }

    void reverse() {
        if (head == null || head.next == head) return;

        Node prev = null;
        Node current = head;
        Node next = null;
        Node first = head;

        do {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        } while (current != head);

        head.next = prev;  // fix last link
        head = prev;
    }
}

public class Circular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CSLL obj = new CSLL();

        while (true) {
            System.out.println("""
            1. Create
            2. Display
            3. Insert at front
            4. Insert at end
            5. Delete at front
            6. Delete at end
            7. Search
            8. Size
            9. Reverse
            10. Exit
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
                case 5 -> obj.deleteAtFront();
                case 6 -> obj.deleteAtEnd();
                case 7 -> {
                    System.out.print("Enter search element: ");
                    obj.search(sc.nextInt());
                }
                case 8 -> obj.size();
                case 9 -> obj.reverse();
                case 10 -> {
                    System.out.println("Exited...");
                    return;
                }
                default -> System.out.println("Invalid Choice");
            }
        }
    }
}
