class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class cll{
    Node head=null;
    void create(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            head.next=newNode;
        }else{
            Node temp=head;
            while(temp.next!=head){
               temp=temp.next; 
            }
            temp.next=newNode;
            newNode.next=head;
        }
    }
    void addAtF(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            head.next=newNode;
        }else{
            Node temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            newNode.next=head;
            head=newNode;
            temp.next=newNode;
        }
    }
    void addAtE(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            head.next=newNode;
        }else{
            Node temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.next=head;
        }
    }
    void deleteAtF(){
        Node temp=head;
        if(head==null || head.next==head){
            head=null;
            return;
        }
        while (temp.next != head) {
            temp = temp.next;
        }

        head = head.next;
        temp.next = head;
    }
    void deleteAtE(){
        Node temp=head;
        if(head==null || head.next==head){
            head=null;
            return;
        }
        while(temp.next.next!=head){
            temp=temp.next;
        }
        temp.next=head;
    }
    void insertAtPos(int data,int pos){
        Node newNode=new Node(data);
        if(pos<0 || pos>size()+1){
            System.out.println("invalid");
            return;
        }
        Node temp=head;
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    void deleteAtMiddle(int pos) {
        Node temp = head;
        if(pos==1){
            deleteAtF();
            return;
        }
        if(pos==size()){
            deleteAtE();
            return;
        }
        else if(pos<0 || pos>size()){
            System.out.println("invalid");
            return;
        }
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    int  size(){
        int s=1;
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
            s++;
        }
        return s;
    }
    void display(){
        if(head==null){
            System.out.println("Empty");
            return;
        }
        Node temp=head;
        do {
            System.out.print(temp.data+" ");
            temp=temp.next; 
            
        } while (temp!=head);
    }
}
public class CircularADD{
    public static void main(String[] args) {
        cll obj=new cll();
        obj.addAtF(10);
        obj.addAtF(20);
        obj.create(30);
        obj.addAtE(40);
        obj.display();
        System.out.println("");
        obj.deleteAtMiddle(1);
        obj.display();
        System.out.println("");
        obj.deleteAtMiddle(3);
        obj.display();
        System.out.println("");
        obj.deleteAtMiddle(3);
        obj.display();

    }
}