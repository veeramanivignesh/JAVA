import java.util.Scanner;

class Stack {
    int maxSize;
    int[] stackArray;
    int top;
    Stack(int size){
        maxSize=size;
        stackArray=new int[size];
        top=-1;
    }
    void push(int value){
        if(top==maxSize-1){
            System.out.println("stack is full");
        }else{
            stackArray[++top]=value;
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("stack is empty");
        }else{
            int val=stackArray[top];
            top--;
            System.out.println("poped:"+ val);
        }
    }
    void peek(){
        if(top==-1){
            System.out.println("Stack is empty");
        }else{
            System.out.println("peek element is :"+stackArray[top]);
        }
    }
    void display(){
        if(top==-1){
            System.out.println("stack is empty");
        }else{
            System.out.print("stack element : ");
            for(int i=top;i>=0;i--){
                System.out.print(stackArray[i]+" ");
            }
        }
    }
    void reverse() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        int start = 0;
        int end = top;

        while (start < end) {
            int temp = stackArray[start];
            stackArray[start] = stackArray[end];
            stackArray[end] = temp;

            start++;
            end--;
        }
}

    void search(int data){
        if(top==-1){
            System.out.println("Stack is empty");
        }else{
            for(int i=top;i>=0;i--){
                if(stackArray[i]==data){
                    System.out.println("this element founded at position :" +(i+1));
                    return;
                }
            }
            System.out.println("element not founded..");
        }
    }

}

public class StackUA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int size = sc.nextInt();

        Stack stack = new Stack(size);

        int choice;
        do {
            System.out.println("\n1. Push 2. Pop 3. Peek 4. Display 5. Exit 6.search 7.reverse");
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
                    System.out.print("Enter value to search: ");
                    value = sc.nextInt();
                    stack.search(value);
                    break;
                case 7:
                    stack.reverse();
                    break; 
                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}
