#include<bits/stdc++.h>
using namespace std;

int main()
{
    string s;
    cin>>s;
    int lc=0,uc=0;
    for(int i=0;i<s.size();i++)
    {
        if(s[i]>='a' && s[i]<='z')
        lc++;
        else uc++;
    }
    if(lc>=uc)
    transform(s.begin(),s.end(),s.begin(),::tolower);
    else
    transform(s.begin(),s.end(),s.begin(),::toupper);
    cout<<s;
}