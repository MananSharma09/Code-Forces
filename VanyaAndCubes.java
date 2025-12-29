import java.util.*;
public class VanyaAndCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int level = 1;
        int used = 0;

        while(true)
        {
            int need = (level*(level+1))/2;
            if(need+used > n)
                break;
            else
            {
                level++;
                used+=need;
            }
        }
        System.out.println(level-1);
    }
}
