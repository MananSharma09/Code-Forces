import java.util.*;
public class IncreasingSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int b=1;
            int lastB=-1;
            for(int i=0;i<n;i++)
            {
                if(b==arr[i])
                    b++;

                lastB=b;
                b++;
            }
            System.out.println(lastB);
        }
    }
}