import java.util.*;
public class BeautifulYear
{
    public static boolean hasDistinct(int y)
    {
        HashSet<Integer> set=new HashSet<>();
        while(y>0)
        {
            set.add(y%10);
            y/=10;
        }
        if(set.size()==4)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        while (true)
        {
            y++;
            if(hasDistinct(y))
            {
                System.out.println(y);
                return;
            }
        }
    }
}