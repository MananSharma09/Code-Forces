import java.util.*;
public class AntonAndPolyhedrons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans=0;
        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0)
        {
            String s=sc.nextLine();
            if(s.equals("Tetrahedron"))
            {
                ans+=4;
            }
            else if(s.equals("Cube"))
            {
                ans+=6;
            }
            else if(s.equals("Octahedron"))
            {
                ans+=8;
            }
            else if(s.equals("Dodecahedron"))
            {
                ans+=12;
            }
            else if(s.equals("Icosahedron"))
            {
                ans += 20;
            }
        }
        System.out.print(ans);
    }
}