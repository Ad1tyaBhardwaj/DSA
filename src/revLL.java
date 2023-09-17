public class revLL {

    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data =data;
            this.next = null;
        }
    }

    public void addFirst(int x){
        Node newNode = new Node(x);
        if(head == null){
            head = newNode;
            
        }
    }

    public static void main(String[] args) {

        revLL link = new revLL();


    }


}
