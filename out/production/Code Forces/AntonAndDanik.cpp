#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin>>n;
    string s;
    cin>>s;
    int dc=0,ac=0;
    for(int i=0;i<n;i++)
    {
        if(s[i]=='A')
        ac++;
        else
        dc++;
    }
    if(ac>dc)
    {
        cout<<"Anton";
    }
    else if(dc>ac)
    {
        cout<<"Danik";
    }
    else
    {
        cout<<"Friendship";
    }
    return 0;
}