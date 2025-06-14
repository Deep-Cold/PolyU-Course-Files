#include<bits/stdc++.h>
using namespace std;
const int N=15;
typedef pair<int,int> PII;
priority_queue<PII,vector<PII>,greater<PII>> heap;
int dis[N],n,m;
bool vis[N];
vector<PII> e[N];
inline char Change(int x)
{
    if(x==1) return 's';
    if(x==n) return 'v';
    else return x-2+'a';
}
inline void Dij()
{
    dis[1]=0;
    heap.push({0,1});
    while(heap.size())
    {
        auto v=heap.top();
        if(vis[v.second]) continue;
        cout<<"Current Point is: "<<Change(v.second)<<endl;
        if(v.second==n) break;
        heap.pop();
        for(auto x : e[v.second])
        {
            if(dis[x.first]<=dis[v.second]+x.second) continue;
            cout<<"\t"<<"dis["<<Change(x.first)<<"] <- "<<dis[v.second]+x.second<<endl;
            dis[x.first]=dis[v.second]+x.second;
            heap.push({dis[x.first],x.first});
        }
    }
}
int main()
{
    memset(dis,0x3f,sizeof(dis));
    scanf("%d%d",&n,&m);
    for(int i=1;i<=m;i++)
    {
        static int x,y,w;
        scanf("%d%d%d",&x,&y,&w);
        e[x].push_back({y,w});
    }
    Dij();
    cout<<"The final result is dis[v] = "<<dis[n]<<endl;
    return 0;
}