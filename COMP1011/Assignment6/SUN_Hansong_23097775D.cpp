#include<bits/stdc++.h>
using namespace std;
const int N=210,M=55;
char str[N][M]={"END"};
int id,len,pos[N];
inline bool Cmp(int a,int b)
{
    return strcmp(str[a],str[b])<0;
}
int main()
{
    do
    {
        cin.getline(str[++id],M);
        len=strlen(str[id]+1);
        for(int i=0;i<=len;i++)
            if(!isalpha(str[id][i]))
            {
                id--;
                puts("Wrong input: please input only upper-case and lower-case letters with no space in between");
                break;
            }
            else if(islower(str[id][i])) str[id][i]-=' ';
    }
    while(strcmp(str[id],str[0]));
    for(int i=1;i<id;i++) pos[i]=i;
    sort(pos+1,pos+id,Cmp);
    for(int i=1;i<id;i++) puts(str[pos[i]]);
    return 0;
}