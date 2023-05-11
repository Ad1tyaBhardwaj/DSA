public class queueCA {

    class queuseCA{
        int arr[];
        int size;
        int front = -1;
        int rear = -1;
        queuseCA(int size){
            this.size = size;
            arr = new int[size];
        }

        public boolean isEmpty(){
            if(rear == -1){
                return true;
            }
            return false;
        }

        public boolean isFull(){
            if((rear+1)%size == front){
                return true;
            }
            return false;
        }

        public void add(int data){
            if(isEmpty()){
                front  = rear = 0;

            }
        }



    }

    public static void main(String[] args) {

    }
}
