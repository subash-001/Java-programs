import java.util.ArrayList;
import java.util.Scanner;
// Using recursion
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,55,6,55,33,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target");
        int target= sc.nextInt();
        System.out.println(findList(arr, target, 0, list));
        // System.out.println(search(arr, target, 0));
        // System.out.println(findElement(arr, target, 0));

    }

    // static int search(int[] arr, int target, int index){
    //     if(index== arr.length) return -1;
    //     if(arr[index]== target) return index;
    //     return search(arr, target, index+1);
    // }

    // static Boolean findElement(int[] arr, int target, int index){
    //     if(index== arr.length){
    //         return false;
    //     }
    //     return arr[index] == target || findElement(arr, target, index+1);
    // }

        // Linear search that returns an ArrayList
    static ArrayList<Integer> list = new ArrayList<>();
   
    static ArrayList<Integer> findList(int[] arr, int target, int index,ArrayList<Integer> list){
        
        if(index== arr.length){
            return list;
        }
        if(arr[index]== target){
            list.add(index);
        }
        return findList(arr, target, index+1, list);
    }




}
