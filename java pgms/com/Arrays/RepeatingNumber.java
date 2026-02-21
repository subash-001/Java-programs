import java.util.*;


public class RepeatingNumber {
      public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5};
        Arrays.sort(arr);
        System.out.println(repeat(arr));
       
      }
      static boolean repeat(int[] arr){

         Set<Integer> set = new HashSet<>();
        for(int i : arr){
            if(set.contains(i)){
                return false;
            }
            set.add(i);
        }
        System.out.println(set);
        return true;
      }



}
