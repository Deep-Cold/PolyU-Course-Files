#include<bits/stdc++.h>
using namespace std;
typedef pair<int,int> PII;
const int N=15;
int c[N],pre[N];
int n,tot;
bool vis[N];
vector<PII> e[N],ans;
inline char Change(int x)
{
    if(x==1) return 's';
    if(x==n) return 'v';
    else return x-2+'a';
}
inline void Prim()
{
    c[1]=0;
    for(int i=1;i<=n;i++)
    {
        int v=0;
        for(int j=1;j<=n;j++)
        {
            if(vis[j]) continue;
            if(!v||c[v]>c[j]) v=j;
        }
        if(v!=1) ans.push_back({pre[v],v}),tot+=c[v];
        vis[v]=true;
        cout<<"Current Point is: "<<v<<endl;
        for(auto u : e[v])
            if(c[u.first]>u.second)
            {
                c[u.first]=u.second,pre[u.first]=v;
                cout<<"\tc["<<u.first<<"] <- "<<u.second<<endl;
            }
    }
}
int main()
{
    memset(c,0x3f,sizeof(c));
    n=12;
    e[1].push_back({2,5}),e[1].push_back({5,5});
    e[2].push_back({1,5}),e[2].push_back({3,2}),e[2].push_back({5,4}),e[2].push_back({7,7});
    e[3].push_back({2,2}),e[3].push_back({4,4}),e[3].push_back({7,1});
    e[4].push_back({3,4}),e[4].push_back({7,3}),e[4].push_back({8,6});
    e[5].push_back({1,5}),e[5].push_back({2,4}),e[5].push_back({6,3}),e[5].push_back({9,1});
    e[6].push_back({5,3}),e[6].push_back({7,2}),e[6].push_back({10,1});
    e[7].push_back({2,7}),e[7].push_back({3,1}),e[7].push_back({4,3}),e[7].push_back({6,2}),e[7].push_back({8,8}),e[7].push_back({10,9}),e[7].push_back({11,1});
    e[8].push_back({4,6}),e[8].push_back({7,8}),e[8].push_back({11,1}),e[8].push_back({12,4});
    e[9].push_back({5,1}),e[9].push_back({10,5});
    e[10].push_back({6,1}),e[10].push_back({7,9}),e[10].push_back({9,5}),e[10].push_back({11,2});
    e[11].push_back({7,1}),e[11].push_back({8,1}),e[11].push_back({10,2}),e[11].push_back({12,8});
    e[12].push_back({8,4}),e[12].push_back({11,8});
    Prim();
    cout<<"The final spanning tree is: ";
    for(auto x : ans) cout<<"("<<x.first<<' '<<x.second<<"), ";
    cout<<endl;
    cout<<"The minimum cost is: "<<tot<<endl;
    return 0;
}