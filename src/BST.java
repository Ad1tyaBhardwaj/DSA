public class BST {
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

    public static boolean search(Node root,int x){
        if(root == null){
            return false;
        }
        if(root.data == x){
            return true;
        } else if (root.data>x) {
            return search(root.left,x);
        }else{
            return search(root.right,x);
        }
    }

    public static void main(String[] args) {
        BST bst = new BST();
        bst.root = new Node(15);
        bst.root.left=new Node(5);
        bst.root.left.left=new Node(3);
        bst.root.right=new Node(20);
        bst.root.right.left=new Node(18);
        bst.root.right.left.left=new Node(16);
        bst.root.right.right=new Node(80);

        if(search(bst.root,3)){
            System.out.println("TRUE");
        }
        else System.out.println("FALSE");
    }

}
