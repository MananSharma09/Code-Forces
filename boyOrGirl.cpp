#include<bits/stdc++.h>
using namespace std;

int main()
{
    string s;
    cin>>s;
    int arr[26]={0};
    for(int i=0;i<s.size();i++)
    {
        arr[s[i]-'a']++;
    }
    int count=0;
    for(int i : arr)
    {
        if(i!=0)
        count++;
    }
    if(count%2==0)
    cout<<"CHAT WITH HER!";
    else
    cout<<"IGNORE HIM!";
}