
class QueueUTS{

    static int stack1[] = new int[100];
    static int stack2[] = new int[100];
    static int top1 = -1;
    static int top2 = -1;
    
    static void enqueue(int x) {
        stack1[++top1] = x;
    }

    static int dequeue() {

        if (top1 == -1 && top2 == -1) {
            System.out.println("Queue is Empty");
            return -1;
        }

        if (top2 == -1) {
            while (top1 != -1) {
                stack2[++top2] = stack1[top1--];
            }
        }

        return stack2[top2--];
    }

    public static void main(String[] args) {

        enqueue(10);
        enqueue(20);
        enqueue(30);

        System.out.println(dequeue());
        System.out.println(dequeue());
        System.out.println(dequeue());
    }
}