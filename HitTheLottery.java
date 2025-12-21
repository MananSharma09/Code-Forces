import java.util.*;
public class HitTheLottery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr ={1,5,10,20,100};
        int ans=0;
        int i=arr.length-1;
        while(n>0)
        {
            if(arr[i]<=n)
            {
                ans+=n/arr[i];
                n=n%arr[i];
            }
            i--;
        }
        System.out.println(ans);
    }
}