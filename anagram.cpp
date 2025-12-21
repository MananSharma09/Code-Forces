#include<iostream>
using namespace std;

bool Anagram(string s1,string s2)
{
    if(s1.length()!=s2.length())
    return false;
    int freq[26]={0};
    for(int i=0;i<s1.length();i++)
    {
        freq[s1[i]-'A']++;
    }
    for(int i=0;i<s2.length();i++)
    {
        freq[s2[i]-'A']--;
    }
    for(int i=0;i<26;i++)
    {
        if(freq[i]!=0)
        return false;
    }
    return true;
}

int main()
{
    string s1,s2;
    cin>>s1>>s2;
    if(Anagram(s1,s2))
    {
        cout<<"YES";
    }
    else
    {
        cout<<"NO";
    }
}