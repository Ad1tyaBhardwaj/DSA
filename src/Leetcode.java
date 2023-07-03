import java.util.List;

public class Leetcode {
    public static void minimumTotal(List<List<Integer>> triangle) {
        int path = triangle.get(0).get(0);
        for(int i=1; i<triangle.size();i++){
            int temp = 0;
            if(triangle.get(i).get(temp)> triangle.get(i).get(temp+1)){
                path = path+triangle.get(i).get(temp);
                System.out.print(triangle.get(i).get(temp));
            }
            else {
                path = path+triangle.get(i).get(temp+1);
                System.out.print(triangle.get(i).get(temp+1));
                temp++;
            }
        }
    }

    public static void main(String[] args) {

    }

}
