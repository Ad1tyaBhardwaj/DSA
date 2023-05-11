import java.util.LinkedList;
import java.util.Queue;

public class trees{
     static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    public static void inorder(Node root) {
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }

    public static void preorder(Node root){
        if(root != null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void postorder(Node root){
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }

    public static void printKdist(Node root, int k){
        if(root == null){
            return;
        }
        if(k==0){
            System.out.print(root.data+" ");
            return;
        }
        printKdist(root.left,k-1);
        printKdist(root.right,k-1);
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

    public static void printLevel(Node root){
        if(root==null)return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(q.isEmpty()==false){
            Node curr=q.poll();
            System.out.print(curr.data+" ");
            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);
        }
    }


    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.right=new Node(70);
        root.right.right.right=new Node(80);
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        printKdist(root,2);
        System.out.println();
        System.out.println("Height of tree is "+ height(root));
        System.out.println();
        System.out.println();
        printLevel(root);
    }
}