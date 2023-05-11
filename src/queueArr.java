public class queueArr {
    static class queue{
        static int arr[];
        static int size;
        static int rear = -1;
        queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
            if(rear == -1){
                return true;
            }
            return false;

        }
        //enqueue
        public static void add(int data){
            if (rear == size-1){
                System.out.println("Full queue");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        //dequeqe
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[0];
        }

    }

    public static void main(String[] args) {
        queue q = new queue(3);
        q.add(2);
        q.add(3);
        q.add(4);
        while (!q.isEmpty()) {
            int x = q.peek();     // get first element of the queue
            System.out.println(x);  // print it
            q.remove();           // remove it from the queue
        }

    }
}
