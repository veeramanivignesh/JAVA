import java.util.Scanner;

class Queue {
    int maxSize;
    int[] queueArray;
    int front;
    int rear;

    Queue(int size) {
        maxSize = size;
        queueArray = new int[size];
        front = -1;
        rear = -1;
    }

    boolean isEmpty() {
        return front == -1;
    }

    boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % maxSize;
        }

        queueArray[rear] = value;
        System.out.println("Inserted: " + value);
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Deleted: " + queueArray[front]);

        if (front == rear) { // only one element
            front = rear = -1;
        } else {
            front = (front + 1) % maxSize;
        }
    }

    void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element is: " + queueArray[front]);
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue elements: ");
        int i = front;

        while (true) {
            System.out.print(queueArray[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % maxSize;
        }
        System.out.println();
    }

    void size() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            int size = (rear - front + maxSize) % maxSize + 1;
            System.out.println("Size: " + size);
        }
    }

    void search(int data) {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        int i = front;
        int position = 1;

        while (true) {
            if (queueArray[i] == data) {
                System.out.println("Element found at position: " + position);
                return;
            }

            if (i == rear)
                break;

            i = (i + 1) % maxSize;
            position++;
        }

        System.out.println("Element not found");
    }
}

public class CircularQueue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue size: ");
        int size = sc.nextInt();

        Queue queue = new Queue(size);

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
                case 5:
                    System.out.println("Exiting...");
                    break;
                case 6:
                    System.out.print("Enter value to search: ");
                    value = sc.nextInt();
                    queue.search(value);
                    break;
                case 7:
                    queue.size();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);

        sc.close();
    }
}
