#include<iostream>
using namespace std;

int main()
{
    int n;
    cin>>n;
    int *arr=new int[n];
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    int currh=0;
    int maxh=0;
    for(int i=0;i<n;i++)
    {
        currh+=arr[i];
        maxh=max(maxh,currh);
    }
    cout<<maxh;
}