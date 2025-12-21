import java.util.*;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int maxele=Integer.MIN_VALUE, maxInd=-1;
        int minele=Integer.MAX_VALUE, minInd=-1;
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]>maxele)
            {
                maxele=arr[i];
                maxInd=i;
            }
            if(arr[i]<=minele)
            {
                minele=arr[i];
                minInd=i;
            }
        }
        int ans=maxInd+(n-1-minInd);
        if(maxInd>minInd)
        {
            ans-=1;
        }
        System.out.print(ans);
    }
}