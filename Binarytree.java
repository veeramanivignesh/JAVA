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
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {
            Node temp1 = root;
            Node temp2 = root;
            int flag = 0;
            while (true) {
                if (temp1.left == null) {
                    temp1.left = newNode;
                    break;
                } else if (temp1.right == null) {
                    temp1.right = newNode;
                    break;
                } else if (flag == 0) {
                    temp1 = temp2.left;
                    flag = 1;
                } else {
                    temp1 = temp2.right;
                    flag = 0;
                    temp2 = temp2.left;
                }
            }
        }
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
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            if (root.data == key)
                root = null;
            return;
        }
        java.util.Queue<Node> queue = new java.util.LinkedList<>();
        queue.add(root);
        Node temp = null;
        Node keyNode = null;

        while (!queue.isEmpty()) {
            temp = queue.poll();

            if (temp.data == key)
                keyNode = temp;

            if (temp.left != null)
                queue.add(temp.left);

            if (temp.right != null)
                queue.add(temp.right);
        }

        if (keyNode != null) {
            int x = temp.data;   
            deleteDeepest(temp);
            keyNode.data = x;
        }
    }
    void deleteDeepest(Node delNode) {
        java.util.Queue<Node> queue = new java.util.LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();

            if (temp.left != null) {
                if (temp.left == delNode) {
                    temp.left = null;
                    return;
                } else {
                    queue.add(temp.left);
                }
            }

            if (temp.right != null) {
                if (temp.right == delNode) {
                    temp.right = null;
                    return;
                } else {
                    queue.add(temp.right);
                }
            }
        }
    }
    void level(Node root){
        java.util.Queue<Node> q = new java.util.LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp=q.poll();
            System.out.println(temp.data);
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
    }
}

public class Binarytree{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Tree obj = new Tree();

        while (true) {
            System.out.println("\n1.Create 2.Inorder 3.Preorder 4.Postorder 7.hight 6.leverorder 5.Exit 8.delete");
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
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
