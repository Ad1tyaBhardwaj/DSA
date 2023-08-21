import java.util.Arrays;

public class trial {
    public static void main(String[] args) {
        int[][] arr = new int[3][2];
        arr[0][0] = 1;
        arr[0][1] = 3;
        arr[1][0] = 4;
        arr[1][1] = 6;
        arr[2][0] = 3;
        arr[2][1] = 5;

        int x = arr[0][0];
        int y = arr[0][1];

        arr[0] = arr[1];


        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }

    }
}
