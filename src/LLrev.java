public class LLrev {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printLL(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+" ");
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        LLrev ll = new LLrev();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printLL();
    }

}
