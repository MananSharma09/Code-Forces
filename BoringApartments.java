import java.util.*;
public class BoringApartments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0)
        {
            int ans=0;
            int num = sc.nextInt();
            int d = num%10;
            ans = (d-1)*10;
            int len = (int)(Math.log10(num))+1;
            ans += (len*(len+1))/2;
            System.out.println(ans);
        }
    }
}
