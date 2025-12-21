#include<iostream>
#include<algorithm>
using namespace std;

int main()
{
    int n1,n2,n3;
    cin>>n1>>n2>>n3;
    int arr[3]={n1,n2,n3};
    sort(arr,arr+3);
    cout<<arr[2]-arr[0];
}