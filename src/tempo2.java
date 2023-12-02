import java.util.HashMap;
import java.util.*;

public class tempo2 {

    public static void main(String[] args) {
        Map<Integer, Integer> lol = new HashMap<>();
        lol.put(100,10);
        lol.put(2,20);
        for(int i=0;i<10;i++){
            lol.computeIfAbsent(i,value -> 50);
        }
        lol.put(300,3);
        System.out.println(lol);
        System.out.println();


        ArrayList<Integer> lol2 = new ArrayList<>();
        lol2.add(3);
        lol2.add(4);
        //ArrayList<int[]> lol3 = new ArrayList<>().add(new int[] {1,2,3});
        //System.out.println(lol3);
        int[] tmp = {1,3,5};

        System.out.println(lol2);
    }
}
