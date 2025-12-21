import java.util.*;
public class SkibidusandOhio
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0)
        {
            boolean flag=false;
            String s = sc.nextLine();
            for (int i = 0; i < s.length()-1; i++) {
                if(s.charAt(i)==s.charAt(i+1))
                {
                    flag=true;
                    System.out.println(1);
                    break;
                }     
            }
            if(!flag) {
                System.out.println(s.length());
            }
        }
        sc.close();
    }
}
