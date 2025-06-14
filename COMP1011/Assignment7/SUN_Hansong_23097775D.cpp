#include<bits/stdc++.h>
const int N=110;
int n;
char str[N];
inline void rotate(char *charArray, int *sizeOfArray)
{
    for(int i=1;i<*sizeOfArray;i++) std::swap(charArray[i],charArray[i+1]);
}
int main()
{
    std::cin>>str+1;
    n=strlen(str+1);
    for(int i=1;i<=n;i++)
    {
        rotate(str,&n);
        puts(str+1);
    }
    return 0;
}