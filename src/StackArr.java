import java.util.ArrayList;

public class StackArr {

    ArrayList<Integer> al = new ArrayList<>();

    public void push(int x){
        al.add(x);
        return;
    }

    public int pop(){
        int res = al.get(al.size()-1);
        al.remove(al.size()-1);
        return res;
    }

    public int peek(){
        return al.get(al.size()-1);
    }

    public boolean isEmpty(){
        return al.isEmpty();
    }

    public int size(){
        return al.size();
    }

    public void printStk(){
        System.out.println(al);
    }

    public static void main(String[] args) {
        StackArr stk = new StackArr();
        stk.push(5);
        stk.push(4);
        stk.push(3);
        stk.printStk();
        System.out.println(stk.pop());
        stk.printStk();
        System.out.println(stk.peek());
        System.out.println(stk.isEmpty());
        System.out.println(stk.size());
    }


}
