import java.util.Scanner;
public class SkibidusandFanumTax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int b=sc.nextInt();
            int c[]=new int[n];
            for(int i=0;i<n;i++)
            {
                c[i]=b-a[i];
            }
            
        }
    }
}
