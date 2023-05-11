public class dequeue{
    int cap, size;
    int arr[];
    dequeue(int c){
        cap = c;
        size = 0;
        arr = new int[cap];
    }

    public boolean isFull(){
        return size == cap;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void insertRear(int x){
        if(isFull()){
            return;
        }
        arr[size] = x;
        size++;
    }

    public void deleteRear(){
        if(isEmpty()){
            return;
        }
        size--;
    }

    public int getRear(){
        if (isEmpty()){
            return -1;
        }
        else {
            return (size-1);
        }
    }
}