import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    Node front=null;
    Node rear=null;
    int size=0;

    boolean isEmpty() {
        return front == null;
    }

    void enqueue(int value) {
        Node newNode = new Node(value);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
        System.out.println("Inserted: " + value);
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Deleted: " + front.data);
            front = front.next;
            size--;

            if (front == null) {   // If queue becomes empty
                rear = null;
            }
        }
    }
    void reverse(){
        Node rear=front;
        Node node=null;
        while(front!=null){
            Node temp=front.next;
            front.next=node;
            node=front;
            front=temp;
        }
        front=node;
    }
    void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element is: " + front.data);
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            Node temp = front;
            System.out.print("Queue elements: ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    void size() {
        System.out.println("Size: " + size);
    }

    void search(int data) {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            Node temp = front;
            int position = 1;

            while (temp != null) {
                if (temp.data == data) {
                    System.out.println("Element found at position: " + position);
                    return;
                }
                temp = temp.next;
                position++;
            }

            System.out.println("Element not found");
        }
    }
}

public class QueueLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue();

        int choice;

        do {
            System.out.println("\n1.Enqueue 2.Dequeue 3.Peek 4.Display 5.Exit 6.Search 7.Size");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int value = sc.nextInt();
                    queue.enqueue(value);
                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    queue.peek();
                    break;

                case 4:
                    queue.display();
                    break;

                case 6:
                    System.out.print("Enter value to search: ");
                    value = sc.nextInt();
                    queue.search(value);
                    break;

                case 7:
                    queue.size();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;
                case 8:
                    queue.reverse();
                    queue.display();;
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}
