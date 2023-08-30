import java.util.*;

public class hashing {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //INSERT
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); //It won't be added again

        //SEARCH
        if(set.contains(1)){
            System.out.println("Set contains 1");
        }

        if(!set.contains(6)){
            System.out.println("SET don't contains 6");
        }

        //DELETE
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("Does not contains 1");
        }

        //SIZE
        int size = set.size();
        System.out.println("Size of set is: "+size);

        //ITERATOR

    }
}