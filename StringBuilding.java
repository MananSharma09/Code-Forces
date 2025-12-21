import java.util.*;
import java.util.jar.JarOutputStream;

public class StringBuilding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0) {
            String str = sc.nextLine();
            boolean ans = true;
            for (int i = 0; i < str.length(); i++) {
                if ((i == 0 || str.charAt(i) != str.charAt(i - 1)) && (i == str.length() - 1 || str.charAt(i) != str.charAt(i + 1))) {
                    ans = false;
                    break;
                }
            }
            System.out.println(ans ? "YES" : "NO");
        }
    }
}