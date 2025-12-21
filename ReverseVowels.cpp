#include<iostream>
using namespace std;

bool isVowel(char c)
{
    if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
    return true;
    return false;
}

int main()
{
    string s;
    getline(cin,s);
    int l=0;
    int e=s.size()-1;
    while (l<e)
    {
        if(!isVowel(s[l]))
        {
            l++;
            continue;
        }
        if(!isVowel(s[e]))
        {
            e--;
            continue;
        }
        swap(s[l++],s[e--]);
    }
    cout<<s;
}