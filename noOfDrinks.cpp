#include<iostream>
using namespace std;

int main()
{
    int n, k, l, c, d, p, nl, np;
    cin>>n>>k>>l>>c>>d>>p>>nl>>np;
    int dt=(k*l)/nl;
    int dl=(c*d);
    int ds=p/np;
    int ans=(min(dt,min(dl,ds)))/n;
    cout<<ans<<endl;
}