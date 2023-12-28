import java.util.ArrayList;

public class trmpo {
    public static void main(String[] args){
        ArrayList<Integer> hello = new ArrayList<>();
        hello.add(1);
        hello.add(2);

        while(hello.isEmpty()){
            System.out.println(hello.remove(0));
        }
    }

    public int[][] asliFunc(int[][] matrix, int x, int y){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i == x || j == y){
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

    public void setZeroes(int[][] matrix) {
        ArrayList<ArrayList<Integer>> val = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    val.add(temp);
                }
            }
        }

        while(!val.isEmpty()){
            ArrayList<Integer> tempo = val.remove(0);
            tempo.get(0);
        }
        return matrix;
    }
}