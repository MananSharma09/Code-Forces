import java.util.*;
public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean flag = true;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i%2==0)
                {
                    System.out.print("#");
                }
                else
                {
                    if(j==0 && flag == false)
                    {
                        System.out.print("#");
                    }
                    else if(j==m-1 && flag == true)
                    {
                        System.out.print("#");
                    }
                    else
                    {
                        System.out.print(".");
                    }
                }
            }
            if(i%2!=0)
            flag = !flag;
            System.out.println();
        }
    }
}