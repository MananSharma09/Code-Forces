#include<iostream>
using namespace std;

int main()
{
    int n;
    cin>>n;
    int x=0;
    string *arr=new string[n];
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    for(int i=0;i<n;i++)
    {
        if(arr[i]=="X++"||arr[i]=="++X")
        {
            x++;
        }
        if(arr[i]=="X--"||arr[i]=="--X")
        {
            x--;
        }
    }
    cout<<x<<endl;
}