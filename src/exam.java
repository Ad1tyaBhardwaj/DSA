//import java.util.*;
//
//public class exam {
//
//    public static int minLengthAfterRemovals(List<Integer> nums){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=-0;i<nums.size();i++){
//            if(map.containsKey(nums.get(i))){
//                map.put(nums.get(i),map.get(nums.get(i))+1);
//            }else{
//                map.put(nums.get(i),1);
//            }
//        }
//
//        int size = totalSum(map);
//        for(int i=0; i<nums.size();i++){
//            int element = nums.get(i);
//            int frq = map.get(element);
//            if(frq<size-frq){
//                size = size-(frq*2);
//                int valI = i;
//                while(frq !=0){
//                    map.put(nums.get(valI+1),map.get(nums.get(valI+1)-1));
//                    frq--;
//                    if(map.get(nums.get(valI+1))==0){
//                        map.remove(nums.get(valI+1),0);
//                        valI++;
//                    }
//                }
//            }
//            return size;
//        }
//
//
//
//        System.out.println(map);
//        System.out.println(totalSum(map));
//    }
//
//    public static int totalSum(HashMap<Integer,Integer> map){
//        Iterator<Map.Entry<Integer,Integer>> iterator = map.entrySet().iterator();
//
//        int val=0;
//        while(iterator.hasNext()){
//            Map.Entry<Integer,Integer> entry = iterator.next();
//            val = val+entry.getValue();
//        }
//        return val;
//    }
//
//    public static void main(String[] args) {
//        List<Integer> arr = new ArrayList<>();
//        arr.add(1);
//        arr.add(1);
//        arr.add(3);
//        arr.add(4);
//        arr.add(5);
//        arr.add(6);
//        System.out.println(arr);
//        System.out.println(minLengthAfterRemovals(arr));
//        minLengthAfterRemovals(arr);
//    }
//}