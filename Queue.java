class QueueA{
    int maxsize;
    int[] QueueArray;
    int front;
    int rear;

     QueueA(int maxsize) {
        this.maxsize=maxsize;
        QueueArray =new int[maxsize];
        front=-1;
        rear=-1;
    }
    boolean isEmpty(){
        return front==-1;
    }
    boolean isFull(){
        return front==(rear+1)%maxsize;
    }
    void enqueue(int data){
       if(isFull()){
        return;
       }else{
        if(front==-1){
            front=rear=0;
            QueueArray[rear]=data;
        }else{
            rear=(rear+1)%maxsize;
            QueueArray[rear]=data;
        }
       }
    }
    void dequeue(){
       if(isEmpty()){
        System.out.println("Empty...");
        return;
       }else{
        if(rear==front){
            rear=front=-1;
        }else{
            front=(front+1)%maxsize;
        }
       }
    }
    void display(){
        if(isEmpty()){
            System.out.println("Empty..");
            return;
        }
        System.out.print("Queue elements: ");
        int i = front;

        while (true) {
            System.out.print(QueueArray[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % maxsize;
        }
        System.out.println();
    }
}
public class Queue{
    public static void main(String[] args) {
        QueueA obj=new QueueA(5);
        obj.enqueue(10);
        obj.enqueue(20);
        obj.dequeue();
        obj.display();
        obj.dequeue();
        obj.display();
        obj.dequeue();
    }
}