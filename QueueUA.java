import java.util.Scanner;

class Queue {
    int maxSize;
    int[] queueArray;
    int front;
    int rear;

    Queue(int size) {
        maxSize = size;
        queueArray = new int[size];
        front = 0;
        rear = -1;
    }

    boolean isEmpty() {
        return rear < front;
    }

    boolean isFull() {
        return rear == maxSize - 1;
    }

    void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            queueArray[++rear] = value;
            System.out.println("Inserted: " + value);
        }
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Deleted: " + queueArray[front]);
            front++;
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
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queueArray[i] + " ");
            }
            System.out.println();
        }
    }
    void size(){
        int s=0;
        if(isEmpty()){
            System.out.println("Emptyy");
        }else{
            System.out.println("Size :"+(rear-front+1));
        }
    }
    void search(int data) {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i <= rear; i++) {
                if (queueArray[i] == data) {
                    System.out.println("Element found at position: " + (i - front + 1));
                    return;
                }
            }
            System.out.println("Element not found");
        }
    }
}

public class QueueUA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue size: ");
        int size = sc.nextInt();

        Queue queue = new Queue(size);

        int choice;
        do {
            System.out.println("\n1.Enqueue 2.Dequeue 3.Peek 4.Display 5.Exit 6.Search 7.size");
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
                case 7:
                    queue.size();
                    break;
                case 6:
                    System.out.print("Enter value to search: ");
                    value = sc.nextInt();
                    queue.search(value);
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}
