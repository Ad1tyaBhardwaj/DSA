public class stackLL {

    Node head;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public boolean isEmpty() {
        if(head == null){
            return true;
        }
        return false;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        Node top = head;
        head = head.next;
        return top.data;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        Node top = head;
        return top.data;
    }


    public static void main(String[] args) {
        stackLL stk = new stackLL();
        stk.push(5);
        stk.push(4);
        stk.push(3);
        System.out.println(stk.isEmpty());
        while(!stk.isEmpty()) {
            System.out.print(stk.peek());
            stk.pop();
        }

        System.out.println(stk.isEmpty());

    }
}