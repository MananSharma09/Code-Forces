import java.util.*;
public class Drinks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        double total=0;
        for(int i=0;i<n;i++)
        {
            total+=sc.nextDouble();
        }
        sc.close();
        System.out.println(total/n);
    }
}
