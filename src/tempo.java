import java.util.HashMap;

public class tempo {


    public static void main(String[] args) {
        HashMap<String,String> book = new HashMap<>();
        book.put("9643274669","Adi");
        book.put("8860030258","Adi");
        book.put("9312552241","Mummy");
        for(String key : book.values()){
            if(key == "Adi"){
                System.out.println(key);
            }
        }
        int x = Integer.MIN_VALUE;

    }
}