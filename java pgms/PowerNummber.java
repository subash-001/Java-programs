import java.util.Scanner;

public class PowerNummber {
    public static void main(String[] args) {
        int res;
        int x, y;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter X:");
        x = s.nextInt();
        System.out.println("Enter Y:");
        y = s.nextInt();
        res = power(x, y);
        System.out.println("Power of two nums :" + res);

    }

    public static int power(int x, int y) {
        int res=1;
        if (y==0){
            return 1;
        }
        else{
        while(y!=0){
            res= res*x;
            System.out.println(res);
            y--;
           
        }
        return res;
    }


    // double x = Math.pow(2, 4);
    // System.out.println(x);
}
}