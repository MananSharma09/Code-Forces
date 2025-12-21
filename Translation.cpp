#include<bits/stdc++.h>
using namespace std;

int main()
{
    string s1,s2;
    cin>>s1>>s2;
    string rev="";
    for(int i=s1.size()-1;i>=0;i--)
    {
        rev+=s1[i];
    }
    if(rev==s2)
    cout<<"YES";
    else
    cout<<"NO";
}