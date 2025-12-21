#include<iostream>
using namespace std;

int main()
{
    string s;
    cin>>s;
    for(int i=0;i<s.size();i++)
    {
        int count=1;
        while(i<s.size() && s[i]==s[i+1])
        {
            count++;
            i++;
        }
        if(count>1)
        cout<<s[i]<<count;
        else
        cout<<s[i];
    }
    return 0;
}