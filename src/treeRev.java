import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class treeRev{
    Node root;
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void preOrder(Node root){
        if(root != null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }

    public static void postOrder(Node root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lDepth = height(root.left);
        int rDepth = height(root.right);
        if(lDepth>rDepth){
            return (lDepth+1);
        }
        else return rDepth+1;
    }

    public static void printKdist(Node root, int k){
        if(root == null){
            return;
        }
        if(k == 0){
            System.out.print(root.data+" ");
        }
        printKdist(root.left,k-1);
        printKdist(root.right,k-1);
    }

    public static void level(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.poll();
            System.out.print(curr.data+" ");
            if(curr.left!= null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
    }

    public static int size(Node root){
        if(root == null){
            return 0;
        }
        else{
            return 1+size(root.left)+size(root.right);
        }
    }

    public static int getMax(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        else{
            return Math.max(root.data,Math.max(getMax(root.left),getMax(root.right)));
        }
    }

    public static void inOrderIte(Node root){
        Stack<Node> st = new Stack<Node>();
        Node curr = root;
        while(curr != null || st.isEmpty()== false){
            while (curr != null){
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            System.out.print(curr.data+" ");
            curr = curr.right;
        }
    }


    public static void main(String[] args) {
        treeRev tree = new treeRev();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);
        tree.root.right.right = new Node(70);
        tree.root.right.right.right = new Node(80);
        System.out.print("PreOrder: ");
        preOrder(tree.root);
        System.out.println();
        System.out.print("InOrder: ");
        inOrder(tree.root);
        System.out.println();
        System.out.print("InOrder Ite: ");
        inOrderIte(tree.root);
        System.out.println();
        System.out.print("PostOrder: ");
        postOrder(tree.root);
        System.out.println();
        System.out.print("Level: ");
        level(tree.root);
        System.out.println();
        System.out.print("Height is: "+height(tree.root));
        System.out.println();
        System.out.print("Print K dist: ");
        printKdist(tree.root,2);
        System.out.println();
        System.out.print("Size: "+size(tree.root));
        System.out.println();
        System.out.print("Max: "+getMax(tree.root));
    }
}