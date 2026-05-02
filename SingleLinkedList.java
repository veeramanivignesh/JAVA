import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SLL {
    Node head = null;
    Node temp = null;

    // Create (insert at end)
    void create(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next = newNode;
        }
    }

    // Display
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Insert at front
    void insertAtFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insert at middle
    void insertAtMiddle(int data, int pos) {
        Node newNode = new Node(data);
        temp = head;

        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete at front
    void deleteAtFront() {
        if (head == null) return;
        head = head.next;
    }

    // Delete at end
    void deleteAtEnd() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }

        temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // Delete at middle
    void deleteAtMiddle(int pos) {
        temp = head;

        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
    }
    void search(int num){
        temp=head;
        while(temp!=null){
            if(temp.data==num){
                System.out.println("founded!!");
                return;
            }
            temp=temp.next;
        }
        
        System.out.println("Not founded");
    }
    void size(){
        temp=head;
        int s=1;
        while(temp.next!=null){
            s++;
            temp=temp.next;
        }
        System.out.println("Size= "+s);
    }
    void reverse(){
        Node node=null;
        while(head!=null){
            Node temp=head.next;
            head.next=node;
            node=head;
            head=temp;
        }
        temp = node;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

public class SingleLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SLL obj = new SLL();

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
            10.search
            11.size
            12.reverse
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
                case 9 -> {
                    System.out.println("Exited..");
                    return;
                }
                case 10->{
                    System.out.print("Enter search element:");
                    int num=sc.nextInt();
                    obj.search(num);
                }
                case 11->obj.size();
                case 12->obj.reverse();
                default -> System.out.println("Invalid Choice");
            }
        }
    }
}
