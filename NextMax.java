import java.util.Scanner;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    Node top;   
    void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }
    void bubbleSort() {
        if (top == null) return;
        Node i, j;
        for (i = top; i.next != null; i = i.next) {
            for (j = top; j.next != null; j = j.next) {
                if (j.data > j.next.data) {
                    int temp = j.data;
                    j.data = j.next.data;
                    j.next.data = temp;
                }
            }
        }
    }
    int  pop() {
        if(top==null){
            return -1;
        }
        int a=top.data;
        top = top.next;
        return a;        
    }
    int peek() {
       return top.data;
    }
    void display(){
        bubbleSort();
        while(top != null){
            int current = pop();
            if(top != null){
                System.out.println(current + " " + peek());
            } else {
                System.out.println(current + " -1");
            }
        }
    }

}
public class NextMax{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stack s=new Stack();
        for(int i=0;i<n;i++){
            s.push(sc.nextInt());
        }
        s.display();
    }
}