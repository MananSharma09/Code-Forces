import java.util.*;
public class Twins {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, sum2=0;
        int ans= 0;
        int []arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--)
        {
            sum2 += arr[i];
            sum -= arr[i];
            ans++;
            if(sum2 > sum)
            {
                System.out.println(ans);
                break;
            }
        }
    }
}
