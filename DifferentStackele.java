import java.util.Scanner;

class Stack {
    int maxSize;
    String[] stackArray;
    int top;
    Stack(int size){
        maxSize=size;
        stackArray=new String[size];
        top=-1;
    }
    void push(String value){
        if(top==maxSize-1){
            
        }else{
            if(peek().equals(value)){
                pop();
            }else{
                stackArray[++top]=value;
            }
        }
    }
    void pop(){
        if(top==-1){
        
        }else{
            String val=stackArray[top];
            top--;
        }
    }
    String peek(){
        if(top==-1){
           
        }else{
            return stackArray[top];
        }
        return " ";
    }
    void display(){
        int s=0;
        if(top==-1){
            
        }else{
            for(int i=top;i>=0;i--){
                s++;
            }
        }
        System.out.print(s);
    }
}

public class DifferentStackele{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] st=sc.nextLine().split(" ");
        int s=st.length;
        Stack stack=new Stack(s);
        for(int i=0;i<s;i++){
            stack.push(st[i]);
        }
        stack.display();
    }
}
