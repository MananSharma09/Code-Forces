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
    int target;
    cin>>target;
    int s=0;
    int e=n-1;
    int mid=s+(e-s)/2;
    while(s<=e)
    {
        if(arr[mid]==target)
        {
            cout<<arr[mid];
            return 0;
        }
        else if(arr[mid]>target)
        {
            e=mid-1;
        }
        else
        {
            s=mid+1;
        }
        mid=s+(e-s)/2;
    }
    cout<<"Element not found";
    delete[] arr;
    return 0;
}