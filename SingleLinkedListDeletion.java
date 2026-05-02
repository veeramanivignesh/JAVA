
import java.util.Scanner;



class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class SLLD{
    Node head=null;
    void create(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    void insertAtFront(int data){
        Node newNode=new Node(data);
        Node temp=head;
        if(head==null){
            head=newNode;
            return;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }
    void deleteAtFront(){
        if(head==null){
            return;
        }else{
            head=head.next;
        }
    }
    void deleteAtEnd(){
        if(head==null){
            return;
        }else{
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }
    }
    void deleteAtMiddle(int pos){
        if(head==null || pos<0){
            return;
        }else if(pos==0){
            deleteAtFront();
            return;
        }else{
            Node temp=head;
            for(int i=0;i<pos-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    void search(int data){
        Node temp=head;
        while(temp!=null){
            if(temp.data==data){
                System.err.println("Founded!!");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Not founded!!");
    }
    void remove_d(){
        
        if (head == null) return;
        for (Node i = head; i != null; i = i.next) {

            for (Node j = i; j.next != null; ) {
                if (i.data == j.next.data) {
                    j.next = j.next.next;  
                } else {
                    j = j.next;            
                }
            }
        }
    }
    void sorting(){
        for(Node i=head;i.next!=null;i=i.next){
            for(Node j=head;j.next!=null;j=j.next){
                if(j.data>j.next.data){
                  int temp=j.data;
                  j.data=j.next.data;
                  j.next.data=temp;  
                }
            }
        }
    }
}
public class SingleLinkedListDeletion {
    public static void main(String[] args) {
        SLLD obj=new SLLD();
        Scanner sc=new Scanner(System.in);
        while (true) { 
            System.out.print("\n1.create 2.sorting 3.remove_duplicates 4.diplay 5.exit..");
            int ch=sc.nextInt();
            switch(ch){
                case 1:
                    System.out.print("Enter data:");
                    int data=sc.nextInt();
                    obj.create(data);
                    break;
                case 2:
                    obj.sorting();
                    break;
                case 3:

                    obj.remove_d();
                    break;
                case 5:
                    System.out.println("Exited..");
                    return;
                case 4:
                    obj.display();
                    break;
            }

        } 
    }
}