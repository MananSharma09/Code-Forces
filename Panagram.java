import java.util.*;
public class Panagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        sc.close();
        int[] sfreq = new int[26];
        int[] cfreq = new int[26];
        for(int i=0;i<n;i++)
        {
            char c = s.charAt(i);

            if(c >= 'a' && c <='z')
            {
                sfreq[c-'a']++;
            }
            if(c >= 'A' && c <= 'Z')
            {
                cfreq[c-'A']++;
            }
        }
        for(int i=0;i<26;i++)
        {
            if(sfreq[i]==0 && cfreq[i]==0)
            {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
