import java.util.*;
public class PolycarpandtheDayofPi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str="31415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679";
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s=sc.nextLine()+'#';
            int ans=0;
            for(int i=0;i<s.length();i++)
            {
                if(str.charAt(i)==s.charAt(i))
                {
                    ans++;
                }
                else
                {
                    System.out.println(ans);
                    System.out.flush();
                    break;
                }
            }
        }
        sc.close();
    }
}
