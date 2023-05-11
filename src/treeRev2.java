import java.util.LinkedList;
import java.util.Queue;

public class treeRev2 {
    Node root;
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

    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root){
        if(root== null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print( root.data+" ");
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lDepth = height(root.left);
        int rDepth = height(root.right);
        if(lDepth>rDepth){
            return lDepth+1;
        }
        else{
            return rDepth+1;
        }
    }

    public static void printKdist(Node root,int k){
        if(root == null){
            return;
        }
        if(k==0){
            System.out.print(root.data+" ");
        }
        printKdist(root.left,k-1);
        printKdist(root.right,k-1);
    }

    public static void levelOrder(Node root){
        if(root == null)return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node currNode = q.poll();
            System.out.print(currNode.data+" ");
            if(currNode.left != null){
                q.add(currNode.left);
            }
            if(currNode.right != null){
                q.add(currNode.right);
            }
        }
    }

    public static int size(Node root){
        if(root == null){
            return 0;
        }else {
            return 1+size(root.left)+size(root.right);
        }
    }

    public static int maxInTree(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        else{
            return Math.max(root.data,Math.max(maxInTree(root.left),maxInTree(root.right)));
        }
    }

    public static void main(String[] args) {
        treeRev2 tree = new treeRev2();
        tree.root = new treeRev2.Node(10);
        tree.root.left = new treeRev2.Node(20);
        tree.root.right = new treeRev2.Node(30);
        tree.root.left.left = new treeRev2.Node(40);
        tree.root.left.right = new treeRev2.Node(50);
        tree.root.right.right = new treeRev2.Node(70);
        tree.root.right.right.right = new treeRev2.Node(80);
        System.out.print("PreOrder: ");
        preOrder(tree.root);
        System.out.println();
        System.out.print("InOrder: ");
        inOrder(tree.root);
        System.out.println();
        System.out.print("PostOrder: ");
        postOrder(tree.root);
        System.out.println();
        System.out.print("Height of tree is: "+height(tree.root));
        System.out.println();
        System.out.print("K-2 dist: ");
        printKdist(tree.root,2);
        System.out.println();
        System.out.print("Level Order: ");
        levelOrder(tree.root);
        System.out.println();
        System.out.print("Size is: "+size(tree.root));
        System.out.println();
        System.out.print("Max is:"+maxInTree(tree.root));

    }
}
