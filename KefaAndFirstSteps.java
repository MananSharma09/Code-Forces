import java.util.*;
public class KefaAndFirstSteps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1)
        {
            System.out.println(1);
            return ;
        }
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int maxlen = 0, currlen = 0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]<=arr[i+1])
            {
                currlen++;
                maxlen = Math.max(maxlen,currlen);
            }
            else
            {
                currlen = 0;
            }
        }
        System.out.println(maxlen);
    }
}
