import java.util.HashSet;

public class Subsequences {

    public static void subsequence(String str, int idx, String NewString){
        if(idx==str.length()){
            System.out.println(NewString);
            return;
        }
        //to be
        subsequence(str,idx+1,NewString+str.charAt(idx));

        //not to be
        subsequence(str, idx+1, NewString);
    }

    public static void uniqueSubSequence(String str, int idx, String newString, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }
            else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        uniqueSubSequence(str,idx+1,newString+str.charAt(idx),set);
        uniqueSubSequence(str,idx+1,newString,set);
    }

    public static void printPerm(String str, String permutation){

        if(str.length()==0){
            System.out.println(permutation);
            return;
        }

        for(int i=0; i<str.length();i++){
            char currChar = str.charAt(i);
            String newString = str.substring(0,i)+str.substring(i+1);
            printPerm(newString,permutation+currChar);
        }
    }

    public static int totalPaths(int i, int j, int n, int m){
        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 && j== m-1){
            return 1;
        }
        int downPaths = totalPaths(i+1,j,n,m);
        int rightPaths = totalPaths(i,j+1,n,m);
        return downPaths+rightPaths;
    }

    public static int subSetSum(int arr[], int n, int sum){
        if(n==0){
            if(sum==0){
                return 1;
            }
            else{
                return 0;
            }
        }
        return subSetSum(arr,n-1,sum)+subSetSum(arr,n-1,sum-arr[n-1]);
    }

    public static int JosephusProblem(int n, int k){
        if(n==1){
            return 0;
        }
        else{
            return (JosephusProblem(n-1,k)+k)%n;
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        subsequence(str,0,"");
        HashSet<String> set = new HashSet<>();
        uniqueSubSequence("aaa",0,"",set);
        System.out.println();
        printPerm("abc","");
        String x = "abc";
        System.out.println("Hello "+x.substring(0,0));
        System.out.println();
        System.out.println(totalPaths(0,0,3,3));
        System.out.println();
        int[] arr = {10,5,2,3,6,15};
        System.out.println(subSetSum(arr,5,8));
        System.out.println(JosephusProblem(7,3));

    }
}
