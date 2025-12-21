import java.util.*;
public class Magnets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLine();
        }
        sc.close();
        int ans=1;
        for(int i=0;i<n-1 ;i++)
        {
            if(!arr[i].equals(arr[i+1]))
            ans++;
        }
        System.out.println(ans);
    }
}
