import javax.swing.plaf.basic.BasicToggleButtonUI;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class tree_motivation {

    public static void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);

        }
    }

    public static void preOrder(Node root){
        if(root != null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
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
        return Math.max(height(root.left),height(root.right))+1;
    }

    public static void printKdist(Node root, int k){
        if(root == null){
            return;
        }
        if(k == 0){
            System.out.print(root.data+" ");
        }
        else{
            printKdist(root.left,k-1);
            printKdist(root.right,k-1);
        }
    }

    public static int getSize(Node root){
        if(root == null){
            return 0;
        }
        return getSize(root.left)+getSize(root.right)+1;
    }

    public static void LevelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node curr = q.poll();
            System.out.print(curr.data+" ");
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
    }

    public static int maxInTree(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data,Math.max(maxInTree(root.left),maxInTree(root.right)));
    }

    static int maxLevel = 0;
    public static void printLeft(Node root, int level){
        if(root == null){
            return;
        }
        if(maxLevel<level){
            System.out.print(root.data+" ");
            maxLevel = level;
        }
        printLeft(root.left,level+1);
        printLeft(root.right,level+1);
    }

    public static boolean isCsum(Node root){
        if(root == null){
            return true;
        }
        if(root.left == null && root.right == null){
            return true;
        }
        int sum = 0;
        if(root.left != null){
            sum += root.left.data;
        }
        if(root.right != null){
            sum += root.right.data;
        }
        return (root.data == sum && isCsum(root.left) && isCsum(root.right));
    }


    static Node prev = null;
    public static Node BTtoDLL(Node root){
        if(root == null){
            return root;
        }
        Node head = BTtoDLL(root.left);
        if(prev == null){
            head = root;
        }
        else{
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        BTtoDLL(root.right);
        return head;
    }


    public static void main(String[] args){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        Node root2 = new Node(30);
        root2.left = new Node((10));
        root2.right = new Node(20);

        System.out.print("Inorder: ");inOrder(root);
        System.out.println();
        System.out.print("PreOrder: ");preOrder(root);
        System.out.println();
        System.out.print("PostOrder: ");postOrder(root);
        System.out.println();
        System.out.print("height: " + height(root));
        System.out.println();
        printKdist(root,2);
        System.out.println();
        System.out.println("size: "+getSize(root));
        LevelOrder(root);
        System.out.println();
        System.out.println("max: "+maxInTree(root));
        printLeft(root,1);
        System.out.println();
        System.out.println(isCsum(root));
        System.out.println(isCsum(root2));

        List<List<Integer>> soln = new ArrayList<>();
    }
}

