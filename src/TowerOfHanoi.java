public class TowerOfHanoi {

    public static void ToH(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+ dest);
            return;
        }
        ToH(n-1,src,dest,helper);
        System.out.println("Transfer disk "+n+" from "+src+" to "+ dest);
        ToH(n-1,helper,src,dest);
    }

    public static void main(String[] args) {
        int n=3;
        ToH(n,"S","H","D");
    }
}