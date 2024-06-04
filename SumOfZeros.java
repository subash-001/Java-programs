public class SumOfZeros {
    public static void main(String[] args) {
        System.out.println(Sum(3000));
    }

    static int Sum(int n){
        //int c=0;
        return helper(n, 0);
    }

    static int helper(int n , int c){
        if(n==0) return c;
        int rem = n%10;
        if(rem==0){
            return helper(n/10, c+1);
        }
        return helper(n/10,c);
    }
}
//this is my first commit
jj