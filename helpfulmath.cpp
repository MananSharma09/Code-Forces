#include<iostream>
using namespace std;

int main()
{
    string s;
    cin>>s;
    int count1=0,count2=0,count3=0;
    for(int i=0;i<s.size();i++)
    {
        if(s[i]=='1')count1++;
        if(s[i]=='2')count2++;
        if(s[i]=='3')count3++;
    }
    while(count1--)
    {
        if(count1==0 && count2==0 && count3==0)
        cout<<'1';
        else
        cout<<'1'<<"+";
    }
    while(count2--)
    {
        if(count2==0 && count3==0)
        cout<<'2';
        else
        cout<<'2'<<"+";
    }
    while(count3--)
    {
        if(count3==0)
        cout<<'3';
        else
        cout<<'3'<<"+";
    }
}