import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
class Tree {
    Node root = null;
    void create(int data) {
        root = insert(root, data);
    }
    Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }
    boolean search(int val,Node root){
        if(root!=null){
            if(val==root.data){
                return true;
            }
            if(root.data>val){
                return search(val,root.left);
            }
            if(root.data<val){
                return search(val,root.right);
            }
            return false;
        }
        return false;
    }
    int hight(Node temp) {
        if (temp == null) {
            return 0;
        }
        return 1 + Math.max(hight(temp.left), hight(temp.right));
    }

    void inorder(Node temp) {
        if (temp != null) {
            inorder(temp.left);
            System.out.print(temp.data + " ");
            inorder(temp.right);
        }
    }
    void preorder(Node temp) {
        if (temp != null) {
            System.out.print(temp.data + " ");
            preorder(temp.left);
            preorder(temp.right);
        }
    }
    void postorder(Node temp) {
        if (temp != null) {
            postorder(temp.left);
            postorder(temp.right);
            System.out.print(temp.data + " ");
        }
    }
    void levelorder(Node temp){
        Deque<Node> queue=new LinkedList<>();
        queue.add(temp);
        while(!queue.isEmpty()){
            Node n=queue.poll();
            System.out.print(n.data+" ");
            if(n.left!=null){
                queue.add(n.left);
            }
            if(n.right!=null){
                queue.add(n.right);
            }
        }
    }
    void delete(int key) {
        root = deleteNode(root, key);
    }

    Node deleteNode(Node root, int key) {
        if (root == null)
            return null;

        if (key < root.data) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        } else {

            // Case 1: No child
            if (root.left == null && root.right == null)
                return null;

            // Case 2: One child
            if (root.left == null)
                return root.right;

            if (root.right == null)
                return root.left;

            // Case 3: Two 5
            Node successor = findMin(root.right);
            root.data = successor.data;
            root.right = deleteNode(root.right, successor.data);
        }
        return root;
    }
    Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}

public class Binarysearchtree{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Tree obj = new Tree();

        while (true) {
            System.out.println("\n1.Create 2.Inorder 3.Preorder 4.Postorder 7.hight 6.leverorder 5.Exit 8.delete 9.search");
            System.out.print("Enter the choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the data: ");
                    int data = sc.nextInt();
                    obj.create(data);
                    break;

                case 2:
                    obj.inorder(obj.root);
                    break;

                case 3:
                    obj.preorder(obj.root);
                    break;

                case 4:
                    obj.postorder(obj.root);
                    break;

                case 5:
                    System.exit(0);
                case 6:
                    obj.levelorder(obj.root);
                    break;
                case 7:
                    System.out.println(obj.hight(obj.root));
                    break;
                case 8:
                    System.out.println("Enter Key: " );
                    obj.delete(sc.nextInt());
                    break;
                case 9:
                    System.out.println("Enter search ele: ");
                    if(obj.search(sc.nextInt(), obj.root)){
                        System.out.println("true");
                    }else{
                        System.out.println("false");
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
