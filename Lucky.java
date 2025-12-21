import java.util.*;
public class Lucky {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n-- > 0)
        {
            String s = sc.nextLine();
            int sum1 = s.charAt(0)+s.charAt(1)+s.charAt(2);
            int sum2 = s.charAt(3)+s.charAt(4)+s.charAt(5);
            if(sum1 == sum2)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
