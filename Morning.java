import java.util.*;
public class Morning {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            int ans=4;
            String s=sc.nextLine();
            for(int i=0;i<s.length();i++)
            {
                int c=s.charAt(i)-'0';
                if(c==0)c=10;
                if(i==0)
                {
                    ans+=Math.abs(1-c);
                }
                else
                {
                    int c1=s.charAt(i-1)-'0';
                    if(c1==0) c1=10;
                    ans+=Math.abs(c1-c);
                }
            }
            System.out.println(ans);
        }
    }
}