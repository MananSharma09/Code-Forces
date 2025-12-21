import java.util.*;
public class CalculatingFunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        long n=sc.nextLong();
        sc.close();
        long ans=(n%2==0) ? n/2 : -(n+1)/2;
        System.out.println(ans);
    }
}
