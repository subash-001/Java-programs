public class MissingNo {
    public static void main(String[] args) {
        int[] arr ={1,2,3,5,6,7};
        int n = arr[arr.length-1];
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;
        for(int i : arr){
            actualSum+=i;

        }
        System.out.println(expectedSum-actualSum);
    }
}
