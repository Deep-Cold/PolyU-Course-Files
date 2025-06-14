#include<bits/stdc++.h>
using namespace std;
const int N=1010;
typedef long long ll;
int a[N],n;
int main()
{
    cout<<"Enter a sequence of integer (-999 to finish): ";
    ll sum=0;
    do cin>>a[++n];
    while(a[n]!=-999);
    for(int i=1;i<n;i++) sum= i&1 ? sum+a[i] : sum-a[i];
    cout<<sum<<endl;
    return 0;
}