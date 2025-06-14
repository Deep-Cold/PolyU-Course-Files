#include<bits/stdc++.h>
using namespace std;
const int N=110,M=55;
int n;
struct node 
{
    char name[M];
    int id;
    inline bool operator<(const node &t) const
    {
        return id<t.id;
    }
    #define name(x) unit[(x)].name
    #define id(x) unit[(x)].id
}unit[N];
int main()
{
    puts("Enter student names and ID, and input END to finish the input:");
    while(true)
    {
        cin>>name(++n);
        if(!strcmp(name(n),"END")) break;
        cin>>id(n);
    }
    sort(unit+1,unit+n);
    for(int i=1;i<n;i++) cout<<name(i)<<' '<<id(i)<<endl;
    return 0;
}