import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class tempo2 {
    public static int score(ArrayList<Integer> arr, int k){
        int idx = arr.indexOf(Collections.max(arr));
        int start = idx-k;
        if(start<0){
            start = 0;
        }
        int end = idx+k;
        if(end>arr.size()-1){
            end = arr.size()-1;
        }
        int sum = 0;
        for(int i=start;i<=end;i++){
            sum = sum + arr.get(i);
        }

        for (int i =start;i<=end;i++){
            System.out.print(arr.get(start)+ " ");
            arr.remove(start);
        }
        System.out.println();
        return sum;
    }

    public static String invertBinaryString(String binaryString) {
        StringBuilder invertedString = new StringBuilder();

        for (char bit : binaryString.toCharArray()) {
            if (bit == '0') {
                invertedString.append('1');
            } else if (bit == '1') {
                invertedString.append('0');
            } else {
                throw new IllegalArgumentException("Invalid binary string: " + binaryString);
            }
        }

        return invertedString.toString();
    }

    public static void toggleA(int rahul, int rupesh, String[] rahulVal, String[] rupeshVal){
        if(rahul>rupesh){
            rahulVal[0] = invertBinaryString(rahulVal[0]);
        }
        else{
            rupeshVal[0] = invertBinaryString(rupeshVal[0]);
        }
    }

    public static void toggleB(String[] rahulVal,String[] rupeshVal, String turn){
        if(turn=="Rupesh"){
            rahulVal[1] =  invertBinaryString(rahulVal[1]);
        }
        else{
            rupeshVal[1] = invertBinaryString(rupeshVal[1]);
        }
    }

    public static void solution(ArrayList<Integer> arr, String[] rahulVal, String[] rupeshVal, int k){

    }

    public static void main(String[] args) {
        int k = 2;
        int rahul = 0;
        int Rupesh = 0;
        String[] rahulVal = {"10","010"};
        String[] rupeshVal = {"011","00"};
        ArrayList<Integer> arr = new ArrayList<>();
        String turn = "rahul";

        Scanner sc = new Scanner(System.in);
        String arrVal = sc.next();
        String rahulStr =sc.next();
        String rupeshStr = sc.next();
        int valk = sc.nextInt();


        while (!arr.isEmpty()){
            if(turn == "rahul"){
                rahul = rahul+score(arr,k);
                turn = "Rupesh";
            }
            else{
                Rupesh = Rupesh+score(arr,k);
                turn = "rahul";
            }
        }
        toggleA(rahul,Rupesh,rahulVal,rupeshVal);
        toggleB(rahulVal,rupeshVal,turn);
        int rahulSol = Integer.parseInt(rahulVal[0]) ^ Integer.parseInt(rahulVal[1]);
        int rupeshSol = Integer.parseInt(rupeshVal[0]) ^ Integer.parseInt(rupeshVal[1]);
        if(rahulSol>rupeshSol){
            System.out.println("Rahul");
        }
        else{
            System.out.println("Rupesh");
        }
    }

}