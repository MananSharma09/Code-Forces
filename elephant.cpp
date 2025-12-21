#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin>>n;
    int c=0;
    while(n)
    {
        if(n>=5)
        {
            c++;n-=5;
        }
        else if(n>=4)
        {
            c++;n-=4;
        }
        else if(n>=3)
        {
            c++;n-=3;
        }else if(n>=2)
        {
            c++;n-=2;
        }else if(n>=1)
        {
            c++;n-=1;
        }
    }
    cout<<c;
}