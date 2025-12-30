import java.util.*;
public class ErasingZeroes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-- > 0)
            {
            int first_one=-1, last_one=-1;
            String s=sc.nextLine();
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i) == '1')
                {
                    first_one=i;
                    break;
                }
            }
            for(int j=s.length()-1;j>=0;j--)
            {
                if(s.charAt(j) == '1')
                {
                    last_one=j;
                    break;
                }
            }
            int count=0;
            for(int k=first_one;k<last_one;k++)
            {
                if(s.charAt(k)=='0')
                count++;
            }
            System.out.println(count);
        }
    }
}
