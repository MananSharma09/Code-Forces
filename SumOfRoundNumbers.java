import java.util.*;
public class SumOfRoundNumbers
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            List<Integer> list=new ArrayList<>();
            int dr=0;
            while(n>0)
            {
                int d=n%10;
                if(d!=0)
                {
                    list.add(d*(int)Math.pow(10,dr));
                }
                dr++;
                n=n/10;
            }
            System.out.println(list.size());
            for(int i : list)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}