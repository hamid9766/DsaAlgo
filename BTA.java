import java.util.Scanner;

public class BTA {
    static Scanner sc = null;

    static Node createTree(){
        Node root = null;

        System.out.println("Enter data : ");
        int data = sc.nextInt();

        if(data == -1)
            return null;

        root = new Node(data);

        System.out.println("Enter left for : " + data);
        root.left = createTree();

        System.out.println("Enter right for : " + data);
        root.right = createTree();

        return root;
    }

    static void preOrder(Node root){
        if(root == null) return;

        System.out.print(root.data + " ");

        preOrder(root.left);

        preOrder(root.right);
    }

    static void inOrder(Node root){
        if(root == null) return;

        inOrder(root.left);

        System.out.print(root.data + " ");

        inOrder(root.right);
    }

    static void postOrder(Node root){
        if(root == null) return;

        postOrder(root.left);

        postOrder(root.right);

        System.out.print(root.data + " ");

    }



    public static void main(String[] args) {
        sc = new Scanner(System.in);

        Node root = createTree();
        preOrder(root);
        System.out.println();

        inOrder(root);
        System.out.println();

        postOrder(root);
        System.out.println();
    }
}

class Node{
    int data;
    Node left, right;

    Node(int val){
        data = val;
        left = null;
        right = null;
    }
}
