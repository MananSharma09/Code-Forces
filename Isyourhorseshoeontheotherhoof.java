import java.util.*;
public class Isyourhorseshoeontheotherhoof {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int []arr=new int[4];
        for(int i=0;i<4;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);
        for(int i=0;i<3;i++)
        {
            if(arr[i]==arr[i+1])
            count++;
        }
        System.out.println(count);
    }
}
