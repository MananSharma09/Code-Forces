import java.util.*;
public class WhereIsTheBishop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            char[][] arr=new char[9][9];
            for(int i=1;i<9;i++)
            {
                String line=sc.next();
                for(int j=1;j<9;j++)
                {
                    arr[i][j]=line.charAt(j-1);
                }
            }
            boolean flag=false;
            for(int i=2;i<=7;i++)
            {
                for(int j=2;j<=7;j++)
                {
                    if(arr[i][j]=='#' && arr[i-1][j-1]=='#' && arr[i-1][j+1]=='#' && arr[i+1][j-1]=='#' && arr[i+1][j+1]=='#')
                    {
                        flag=true;
                        System.out.println(i+" "+j);
                    }
                    if(flag) break;
                }
                if (flag) break;
            }
        }
    }
}