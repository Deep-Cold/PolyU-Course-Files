#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
const int N=1010;
int a[N],n;
inline int Max(int*);
inline int Min(int*);
inline ll Tot(int*);
inline double Ave(int*);
int main()
{
    cout<<"Enter a sequence of integer (-999 to finish): ";
    do cin>>a[++n];
    while(a[n]!=-999);
    cout<<"Largest Number is "<<Max(a)<<endl;
    cout<<"Smallest Number is "<<Min(a)<<endl;
    cout<<"Total is "<<Tot(a)<<endl;
    cout<<"Average is "<<setprecision(3)<<fixed<<Ave(a)<<endl;
    return 0;
}
inline int Max(int *a)
{
    int res= n>1 ? INT_MIN : 0;
    for(int i=1;i<n;i++)
        res=max(res,a[i]);
    return res;
}
inline int Min(int *a)
{
    int res= n>1 ? INT_MAX : 0;
    for(int i=1;i<n;i++)
        res=min(res,a[i]);
    return res;
}
inline ll Tot(int *a)
{
    ll res=0;
    for(int i=1;i<n;i++)
        res+=a[i];
    return res;
}
inline double Ave(int *a)
{
    double res=0;
    for(int i=1;i<n;i++)
        res+=a[i];
    res/=1.0*max(1,n-1);
    return res;
}