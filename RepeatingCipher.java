import java.util.*;
public class RepeatingCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        int num=1;
        for(int i=0;i<s.length();i+=num)
        {
            sb.append(s.charAt(i));
            num++;
        }
        System.out.println(sb);
    }
}