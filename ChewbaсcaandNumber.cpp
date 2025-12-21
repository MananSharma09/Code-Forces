#include<iostream>
using namespace std;

int main()
{
    string s;
    cin>>s;
    int n = s.size();
    string res="";
    for(int i=0;i<n;i++)
    {
        int digit=s[i]-'0';
        int invdig=9-digit;
        if(i==0 && invdig==0)
        res+=to_string(digit);
        else
        res+=to_string(min(digit,invdig));
    }
    cout<<res<<endl;
}