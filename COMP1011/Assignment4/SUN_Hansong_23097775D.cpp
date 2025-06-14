#include<bits/stdc++.h>
using namespace std;
const int N=1010;
int a[N],n;
inline bool Cmp(int a,int b)
{
    if((a&1)^(b&1)) return a&1;
    else if(a&1) return a<b;
    return a>b;
}
inline void Solve()
{
    sort(a+1,a+n,Cmp);
    for(int i=1;i<n;i++) cout<<a[i]<<' ';
    putchar('\n');
}
int main()
{
    cout<<"Enter a sequence of integer (-999 to finish): ";
    do cin>>a[++n];
    while(a[n]!=-999);
    Solve();
    return 0;
}