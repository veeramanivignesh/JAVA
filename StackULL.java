import java.util.Scanner;

// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack class
class Stack {
    Node top;   // head of linked list

    // Push operation
    void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println(value + " pushed into stack");
    }

    // Pop operation
    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow! Stack is empty");
        } else {
            System.out.println(top.data + " popped from stack");
            top = top.next;
        }
    }

    // Peek operation
    void peek() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element is: " + top.data);
        }
    }

    // Display stack
    void display() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            Node temp = top;
            System.out.println("Stack elements:");
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    Node node=null;
    void reverse(){
        while(top!=null){
            Node temp=top.next;
            top.next=node;
            node=top;
            top=temp;
        }
        if (node == null) {
            System.out.println("Stack is empty");
        } else {
            Node temp = node;
            System.out.println("Stack elements:");
            while (temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }
}

public class StackULL{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();

        int choice;
        do {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.err.println("6.reverese");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.peek();
                    break;

                case 4:
                    stack.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;
                case 6:
                    stack.reverse();
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}
