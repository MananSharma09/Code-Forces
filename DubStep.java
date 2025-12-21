import java.util.*;
public class DubStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String words[] = s.split("WUB");
        StringBuilder sb = new StringBuilder();
        for(String word : words)
        {
            if(!word.isEmpty())
            {
                if(sb.length()>0)
                sb.append(" ");
                sb.append(word);
            }
        }
        System.out.println(sb.toString());
    }
}
