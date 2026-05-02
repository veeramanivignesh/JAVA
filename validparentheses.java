import java.util.Scanner;

class Stack {
    char[] arr;
    int top;
    int size;

    Stack(int size) {
        this.size = size;
        arr = new char[size];
        top = -1;
    }

    void push(char c) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = c;
        }
    }

    char pop() {
        if (top == -1) {
            return '#';   // special symbol for empty
        } else {
            return arr[top--];
        }
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class validparentheses{

    static boolean isValid(String str) {
        Stack stack = new Stack(str.length());

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter expression: ");
        String input = sc.nextLine();

        if (isValid(input)) {
            System.out.println("Valid Parentheses");
        } else {
            System.out.println("Invalid Parentheses");
        }

        sc.close();
    }
}
