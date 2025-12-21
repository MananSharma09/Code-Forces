import java.util.*;
public class TreasureChest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int k=sc.nextInt();
            if(y<x)
            {
                System.out.println(x);
            }
            else
            {
                System.out.println(y+Math.max(0,y-x-k));
            }
        }
    }
}