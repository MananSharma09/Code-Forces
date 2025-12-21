import java.util.*;
public class TaisiaAndDice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int s=sc.nextInt();
            int r=sc.nextInt();
            int maxValue=s-r;
            int remaining=r;
            List<Integer> list=new ArrayList<>();
            while(remaining>=maxValue)
            {
                list.add(maxValue);
                remaining-=maxValue;
            }
            if(remaining>0)
            {
                list.add(remaining);
            }
            for(int i=0;i<list.size() && list.size()+1<n;)
            {
                if(list.get(i)==1)
                {
                    i++;
                    continue;
                }
                list.set(i,list.get(i)-1);
                list.add(1);
            }
            list.add(maxValue);
            Collections.sort(list);
            for(int i : list)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}