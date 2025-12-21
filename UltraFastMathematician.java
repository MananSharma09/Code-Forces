import java.util.*;
public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String n1=sc.next();
        String n2=sc.next();
        sc.close();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n1.length();i++)
        {
            char b1=n1.charAt(i);
            char b2=n2.charAt(i);
            sb.append((b1==b2) ? 0 : 1);
        }
        System.out.println(sb);
    }
}
