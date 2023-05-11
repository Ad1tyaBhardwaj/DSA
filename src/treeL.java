public class treeL {
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

    public static void dfs(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data);
        dfs(root.left);
        dfs(root.right);
    }

    public static void main(String[] args) {
        treeL tree = new treeL();
        tree.root =  new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        dfs(tree.root);
    }
}
