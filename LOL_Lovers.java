import java.util.*;
public class LOL_Lovers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        int totalL=0,totalO=0;
        for(char c : s.toCharArray())
        {
            if(c=='L') totalL++;
            else totalO++;
        }
        int leftL=0,leftO=0;
        for(int k=1;k<n;k++)
        {
            if(s.charAt(k-1)=='L') leftL++;
            else leftO++;

            int rightL=totalL-leftL;
            int rightO=totalO-leftO;

            if(leftL != rightL && leftO != rightO)
            {
                System.out.println(k);
                return;
            }
        }
        System.out.println(-1);
    }
}