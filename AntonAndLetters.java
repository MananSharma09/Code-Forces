import java.util.*;
public class AntonAndLetters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashSet<Character> set=new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                set.add(s.charAt(i));
            }
        }
        System.out.println(set.size());
    }
}