import java.util.*;
public class NextRound
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int ans = 0;
        for(int i = 0 ;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int min = arr[n-k];
        for(int i = 0; i < n; i++)
        {
            if(arr[i]>=min && arr[i]>0)
            {
                ans++;
            }
        }
        System.out.println(ans);
    }
} 