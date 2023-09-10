import java.util.HashSet;

public class trial {

    public static void subSequences(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        subSequences(str,idx+1,newString+str.charAt(idx));
        subSequences(str,idx+1,newString);
    }

    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if(n == 1){
            System.out.println("Transfer "+n+ " from "+src+" to "+ dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer "+n+ " from "+src+" to "+ dest);
        towerOfHanoi(n-1, helper, src, dest);
    }

    public static void printPerm(String str, String permutation){

        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }

        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            String newString = str.substring(0,i)+str.substring(i+1);
            printPerm(newString,permutation+currChar);
        }
    }

    public static void uniqueSubSequence(String str, int idx, String subSq, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(subSq)){
                return;
            }
            else{
                set.add(subSq);
                System.out.println(subSq);
                return;
            }
        }
        uniqueSubSequence(str,idx+1,subSq+str.charAt(idx),set);
        uniqueSubSequence(str,idx+1,subSq,set);
    }

    public static void main(String[] args) {
        subSequences("abc",0,"");
        System.out.println();
        towerOfHanoi(3,"S","H","D");
        System.out.println();
        printPerm("abc","");
        System.out.println();
        HashSet<String> set = new HashSet<>();
        uniqueSubSequence("aaa",0,"",set);

    }
}