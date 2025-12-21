#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin>>n;
    vector<int>arr(n);
    for(int i=0;i<n;i++)
    {
        int x;
        cin>>x;
        if(x==1){
            cout<<"HARD";
            return 0;
        }
    }
    cout<<"EASY";
    return 0;
}
/**
 * SearchForAnEasyProblem
 */
// import java.util.*;
// public class SearchForAnEasyProblem {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         boolean ishard=false;
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=sc.nextInt();
//             if(arr[i]==1)
//             {
//                 ishard=true;
//                 break;
//             }
//         }
//         if(ishard)
//         System.out.println("HARD");
//         else
//         System.out.println("EASY");
//         sc.close();
//     }
// }